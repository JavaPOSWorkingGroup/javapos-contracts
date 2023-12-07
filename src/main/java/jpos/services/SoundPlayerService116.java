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
// SoundPlayerService116
//
//   Interface defining all new capabilities, properties and methods
//   that are specific to Gesture Control for release 1.16.
//
//   Automatically generated from SoundPlayerControl116.
//
/////////////////////////////////////////////////////////////////////

package jpos.services;

import jpos.*;

public interface SoundPlayerService116 extends BaseService, jpos.loader.JposServiceInstance
{
	// Capabilities
	public String  getCapAssociatedHardTotalsDevice() throws JposException;
	public boolean getCapCompareFirmwareVersion() throws JposException;
	public boolean getCapMultiPlay() throws JposException;
	public int     getCapPowerReporting() throws JposException;
	public String  getCapSoundTypeList() throws JposException;
	public boolean getCapStatisticsReporting() throws JposException;
	public int     getCapStorage() throws JposException;
	public boolean getCapUpdateFirmware() throws JposException;
	public boolean getCapUpdateStatistics() throws JposException;
	public boolean getCapVolume() throws JposException;
	
	// Properties
	public String  getDeviceSoundList() throws JposException;
	public int     getOutputID() throws JposException;
	public String  getOutputIDList() throws JposException;
	public int     getPowerNotify() throws JposException;
	public void    setPowerNotify(int newValue) throws JposException;
	public int     getPowerState() throws JposException;
	public int     getStorage() throws JposException;
	public void    setStorage(int newValue) throws JposException;
	public int     getVolume() throws JposException;
	public void    setVolume(int newValue) throws JposException;
	
	// Methods
	public void    clearOutput() throws JposException;
	public void    compareFirmwareVersion(String firmwareFileName, int[] result) throws JposException;
	public void    playSound(String fileName, boolean loop) throws JposException;
	public void    resetStatistics(String statisticsBuffer) throws JposException;
	public void    retrieveStatistics(String[] statisticsBuffer) throws JposException;
	public void    stopSound(int outputID) throws JposException;
	public void    updateFirmware(String firmwareFileName) throws JposException;
	public void    updateStatistics(String statisticsBuffer) throws JposException;
	
}
