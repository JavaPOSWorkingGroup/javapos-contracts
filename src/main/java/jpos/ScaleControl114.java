//////////////////////////////////////////////////////////////////////
//
// The JavaPOS library source code is now under the CPL license, which 
// is an OSS Apache-like license. The complete license is located at:
//    http://www.ibm.com/developerworks/library/os-cpl.html
//
//////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////
//
// This software is provided "AS IS".  The JavaPOS working group (including
// each of the Corporate members, contributors and individuals)  MAKES NO
// REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE,
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NON-INFRINGEMENT. The JavaPOS working group shall not be liable for
// any damages suffered as a result of using, modifying or distributing this
// software or its derivatives.Permission to use, copy, modify, and distribute
// the software and its documentation for any purpose is hereby granted.
//
// ScaleControl114
//
// Interface defining all new capabilities, properties and methods
// that are specific to Scale for release 1.14.
//
// Modification history
// ------------------------------------------------------------------
// 2013-Jul-25 JavaPOS Release 1.14                                BS
//
/////////////////////////////////////////////////////////////////////

package jpos;

public interface ScaleControl114 extends ScaleControl113
{
  // Capabilities
  public boolean getCapFreezeValue() throws JposException;
  public boolean getCapReadLiveWeightWithTare() throws JposException;
  public boolean getCapSetPriceCalculationMode() throws JposException;
  public boolean getCapSetUnitPriceWithWeightUnit() throws JposException;
  public boolean getCapSpecialTare() throws JposException;
  public boolean getCapTarePriority() throws JposException;

  // Properties
  public int     getMinimumWeight() throws JposException;

  // Methods
  public void    doPriceCalculating(int[]  weightValue,
                                    int[]  tare,
                                    long[] unitPrice,
                                    long[] unitPriceX,
                                    int[]  weightUnitX,
                                    int[]  weightNumeratorX,
                                    int[]  weightDenominatorX,
                                    long[] price,
                                    int    timeout) throws JposException;
  public void    freezeValue(int     item,
                             boolean freeze) throws JposException;
  public void    readLiveWeightWithTare(int[] weightData,
                                        int[] tare,
                                        int   timeout) throws JposException;
  public void    setPriceCalculationMode(int mode) throws JposException;
  public void    setSpecialTare(int mode,
                                int data) throws JposException;
  /**
   * @deprecated use {@link #setTarePriority(int)} instead.
   */
  public void    setTarePrioity(int priority) throws JposException;
  public void    setTarePriority(int priority) throws JposException; // substitutes setTarePrioity which has a spelling error
  public void    setUnitPriceWithWeightUnit(long unitPrice,
                                            int  weightUnit,
                                            int  weightNumerator,
                                            int  weightDenominator) throws JposException;
}