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
// GestureControlService116
//
//   Interface defining all new capabilities, properties and methods
//   that are specific to Gesture Control for release 1.16.
//
//   Automatically generated from GestureControlControl116.
//
/////////////////////////////////////////////////////////////////////

package jpos.services;

import jpos.*;

public interface GestureControlService116 extends BaseService, jpos.loader.JposServiceInstance
{
	// Capabilities
	public String  getCapAssociatedHardTotalsDevice() throws JposException;
	public boolean getCapCompareFirmwareVersion() throws JposException;
	public boolean getCapMotion() throws JposException;
	public boolean getCapMotionCreation() throws JposException;
	public boolean getCapPose() throws JposException;
	public boolean getCapPoseCreation() throws JposException;
	public int     getCapPowerReporting() throws JposException;
	public boolean getCapStatisticsReporting() throws JposException;
	public int     getCapStorage() throws JposException;
	public boolean getCapUpdateFirmware() throws JposException;
	public boolean getCapUpdateStatistics() throws JposException;
	
	// Properties
	public String  getAutoMode() throws JposException;
	public void    setAutoMode(String newValue) throws JposException;
	public String  getAutoModeList() throws JposException;
	public String  getJointList() throws JposException;
	public String  getMotionList() throws JposException;
	public int     getOutputID() throws JposException;
	public boolean getPoseCreationMode() throws JposException;
	public void    setPoseCreationMode(boolean newValue) throws JposException;
	public String  getPoseList() throws JposException;
	public int     getPowerNotify() throws JposException;
	public void    setPowerNotify(int newValue) throws JposException;
	public int     getPowerState() throws JposException;
	public int     getStorage() throws JposException;
	public void    setStorage(int newValue) throws JposException;
	
	// Methods
	public void    clearOutput() throws JposException;
	public void    compareFirmwareVersion(String firmwareFileName, int[] result) throws JposException;
	public void    createMotion(String fileName, String poseList) throws JposException;
	public void    createPose(String fileName, int time) throws JposException;
	public void    getPosition(String jointID, int[] position) throws JposException;
	public void    resetStatistics(String statisticsBuffer) throws JposException;
	public void    retrieveStatistics(String[] statisticsBuffer) throws JposException;
	public void    setPosition(String positionList, int time, boolean absolute) throws JposException;
	public void    setSpeed(String speedList, int time) throws JposException;
	public void    startMotion(String fileName) throws JposException;
	public void    startPose(String fileName) throws JposException;
	public void    stopControl(int outputID) throws JposException;
	public void    updateFirmware(String firmwareFileName) throws JposException;
	public void    updateStatistics(String statisticsBuffer) throws JposException;
	
}
