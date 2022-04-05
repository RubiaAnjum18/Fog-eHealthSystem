package org.eclipse.acceleo.module.sample.Java;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.impl.EGenericTypeImpl;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.FinalState;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.PseudostateKind;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Vertex;


import com.google.common.io.Files;

/**
 * 
 * @author tayyba
 *
 */
public class JavaServices
{
	private static String designFileName;
	private static String designFilePath;
	private static List<List<Vertex> > aList = new ArrayList<List<Vertex> >();
	private static Vertex currentver;
	
	
	public static void reset()
	{
		designFileName = null;
		
	}
	public static void designFilePath(String name)
	{
		designFilePath = name;
	}
	public static String designFilePath()
	{
		return designFilePath;
	}
	public static void setDesignFileName(String name)
	{
		designFileName = name;
	}
	public static String getdesignFileName()
	{
		return designFileName;
	}
	
	public String getTime(String message)
	{
		Date date = new Date();
		System.out.println(message+date.toString());
		return null;
	}
	
	public String prepareRequirementFile(String str)
	{
		if(str.contains("<>"))
		{
			str=str.replaceAll("<>", "!=");
			
		}
		if(str.contains("="))
		{
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			char character = '=';
			for(int i = 0; i < str.length(); i++){
			    if(str.charAt(i) == character){
			       list.add(i);
			    }
			}
			 for(Integer i : list){
			        if(str.charAt(i-1)=='=' || str.charAt(i+1)=='=' || str.charAt(i-1)=='!' || str.charAt(i-1)=='<' || str.charAt(i-1)=='>')
			        {
			        	
			        }else
			        {
			        	str=str.replaceAll("=", "==");
			        }
			    }

		}
		if(str.contains("and"))
		{
			str=str.replaceAll("and", "&&");
			
		}
		if(str.contains("not"))
		{
			str=str.replaceAll("not", "!");
			
		}
		if(str.contains("or"))
		{
			str=str.replaceAll("or", "||");
			
		}
		if(str.contains("xor"))
		{
			str=str.replaceAll("xor", "^");
			
		}
		if(str.contains("implies"))
		{
			str=str.replaceAll("implies", "|->");
			
		}

		return str;
	}
	public String stateMachineExtracts(StateMachine sm)
	{
	Region region = sm.getRegions().get(0);
	EList<EObject> contents = region.eContents();
	for(EObject eObj : contents) {
	//System.out.println("obj is : "+eObj.toString());
	if(eObj.eClass().getInstanceClass() == FinalState.class)
	{
	FinalState ps= (FinalState) eObj;
	//System.out.println("pseudostate is : "+ps.toString());
	if(ps.getLabel().contains("FinalState"))
	{
	List<Transition> ts=ps.getIncomings();
	for(int i=0; i<ts.size();i++)
	{
	List<Vertex> stack=new ArrayList<Vertex>();
	stack.add(ps);
	this.recursivecall(ts.get(i),stack);
	aList.add(stack);

	}
	}
	}
	}
	return null;
	}
	
	public void recursivecall(Transition ts, List<Vertex> stack)
	{
	currentver=ts.getSource();
	stack.add(currentver);
	if(currentver.getLabel().contains("Initial"))
	{

	}else
	{
	recursivecall(currentver.getIncomings().get(0), stack);
	}
	}
	public void copyFileIntoDest(String sourcepath, String destpath) throws IOException
	{
		Path src = Paths.get(sourcepath);
		Path filename= src.getFileName();
		destpath=destpath.concat("\\"+filename);
        Path dest1 = Paths.get(destpath);
        Files.copy(src.toFile(), dest1.toFile());
	}
}


	
	