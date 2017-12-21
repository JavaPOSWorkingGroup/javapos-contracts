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
// ElectronicValueRWControl114
//
// Interface definining all new capabilities, properties and methods
// that are specific to Electronic Value RW for release 1.14.
//
// Modification history
// ------------------------------------------------------------------
// 2013-Jul-25 JavaPOS Release 1.14                                BS
//
/////////////////////////////////////////////////////////////////////

package jpos;

import jpos.events.*;

public interface ElectronicValueRWControl114 extends ElectronicValueRWControl113
{
  // Capabilities
  public boolean getCapPINDevice() throws JposException;
  /**
   * @deprecated use {@link #getCapTrainingMode()} instead
   */
  public boolean CapTrainingMode() throws JposException;
  public boolean getCapTrainingMode() throws JposException; // substitutes CapTrainingMode which does not follow the naming schema

  // Properties
  public int     getPINEntry() throws JposException;
  public void    setPINEntry(int pinEntry) throws JposException;
  public int     getTrainingModeState() throws JposException;
  public void    setTrainingModeState(int trainingModeState) throws JposException;

  // Methods
  public void    clearParameterInformation() throws JposException;
  public void    queryLastSuccessfulTransactionResult() throws JposException;
  public void    retrieveResultInformation(String   name,
                                           String[] value) throws JposException;
  public void    setParameterInformation(String name,
                                         String value) throws JposException;

  // Event listener methods
  public void    addTransitionListener(TransitionListener l);
  public void    removeTransitionListener(TransitionListener l);
}
