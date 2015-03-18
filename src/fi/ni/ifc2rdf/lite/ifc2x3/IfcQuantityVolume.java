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

public class IfcQuantityVolume extends IfcPhysicalSimpleQuantity 
{
 // The property attributes
 Double volumeValue;


 // Getters and setters of properties

 public Double getVolumeValue() {
   return volumeValue;
 }
 public void setVolumeValue(String txt){
   Double value = i.toDouble(txt);
   this.volumeValue=value;

 }

}