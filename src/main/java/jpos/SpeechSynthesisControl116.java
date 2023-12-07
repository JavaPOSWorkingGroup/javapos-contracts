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
// SpeechSynthesisControl116
//
// Interface definining all new capabilities, properties and methods
// that are specific to Speech Synthesis for release 1.16.
//
// Modification history
// ------------------------------------------------------------------
// 2023-Sep-28 JavaPOS Release 1.16                                MC
//
/////////////////////////////////////////////////////////////////////

package jpos;

import jpos.events.*;

public interface SpeechSynthesisControl116 extends BaseControl
{
    public boolean getCapCompareFirmwareVersion() throws JposException;

    public int getCapPowerReporting() throws JposException;

    public boolean getCapStatisticsReporting() throws JposException;

    public boolean getCapUpdateFirmware() throws JposException;

    public boolean getCapUpdateStatistics() throws JposException;

    public int getOutputID() throws JposException;

    public int getPowerNotify() throws JposException;

    public void setPowerNotify(int var1) throws JposException;

    public int getPowerState() throws JposException;

    public void clearOutput() throws JposException;

    public void compareFirmwareVersion(String firmwareFileName, int[] result) throws JposException;

    public void resetStatistics(String var1) throws JposException;

    public void retrieveStatistics(String[] var1) throws JposException;

    public void updateFirmware(String var1) throws JposException;

    public void updateStatistics(String var1) throws JposException;

    public boolean getCapLanguage() throws JposException;

    public boolean getCapPitch() throws JposException;

    public boolean getCapSpeed() throws JposException;

    public boolean getCapVoice() throws JposException;

    public boolean getCapVolume() throws JposException;

    public String getLanguage() throws JposException;

    public void setLanguage(String var1) throws JposException;

    public String getLanguageList() throws JposException;

    public String getOutputIDList() throws JposException;

    public int getPitch() throws JposException;

    public void setPitch(int var1) throws JposException;

    public int getSpeed() throws JposException;

    public void setSpeed(int var1) throws JposException;

    public String getVoice() throws JposException;

    public void setVoice(String var1) throws JposException;

    public String getVoiceList() throws JposException;

    public int getVolume() throws JposException;

    public void setVolume(int var1) throws JposException;

    public void speak(String text) throws JposException;

    public void speakImmediate(String text) throws JposException;

    public void stopCurrentSpeaking() throws JposException;

    public void stopSpeaking(int outputID) throws JposException;

    public void    addDirectIOListener(DirectIOListener l);
    public void    removeDirectIOListener(DirectIOListener l);
    public void    addErrorListener(ErrorListener l);
    public void    removeErrorListener(ErrorListener l);
    public void    addOutputCompleteListener(OutputCompleteListener l);
    public void    removeOutputCompleteListener(OutputCompleteListener l);
    public void    addStatusUpdateListener(StatusUpdateListener l);
    public void    removeStatusUpdateListener(StatusUpdateListener l);
}
