package fi.ni.ifc2rdf.lite.ifc2x3;
import fi.ni.ifc2rdf.lite.*;
import fi.ni.ifc2rdf.lite.ifc2x3.interfaces.*;

import java.util.*;

/*
 * IFC Java class
 * @author Jyrki Oraskari
 * @license This work is licensed under a Creative Commons Attribution 3.0 Unported License.
 * http://creativecommons.org/licenses/by/3.0/ 
 */

public class IfcSIUnit extends IfcNamedUnit 
{
 // The property attributes
 String prefix;
 String name;


 // Getters and setters of properties

 public String getPrefix() {
   return prefix;
 }
 public void setPrefix(String value){
   this.prefix=value;

 }

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

}