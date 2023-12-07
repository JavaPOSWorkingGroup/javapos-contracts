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
// VideoCaptureService116
//
//   Interface defining all new capabilities, properties and methods
//   that are specific to Gesture Control for release 1.16.
//
//   Automatically generated from VideoCaptureControl116.
//
/////////////////////////////////////////////////////////////////////

package jpos.services;

import jpos.*;

public interface VideoCaptureService116 extends BaseService, jpos.loader.JposServiceInstance
{
	// Capabilities
	public String  getCapAssociatedHardTotalsDevice() throws JposException;
	public boolean getCapAutoExposure() throws JposException;
	public boolean getCapAutoFocus() throws JposException;
	public boolean getCapAutoGain() throws JposException;
	public boolean getCapAutoWhiteBalance() throws JposException;
	public boolean getCapBrightness() throws JposException;
	public boolean getCapCompareFirmwareVersion() throws JposException;
	public boolean getCapContrast() throws JposException;
	public boolean getCapExposure() throws JposException;
	public boolean getCapGain() throws JposException;
	public boolean getCapHorizontalFlip() throws JposException;
	public boolean getCapHue() throws JposException;
	public boolean getCapPhoto() throws JposException;
	public boolean getCapPhotoColorSpace() throws JposException;
	public boolean getCapPhotoFrameRate() throws JposException;
	public boolean getCapPhotoResolution() throws JposException;
	public boolean getCapPhotoType() throws JposException;
	public int     getCapPowerReporting() throws JposException;
	public boolean getCapSaturation() throws JposException;
	public boolean getCapStatisticsReporting() throws JposException;
	public int     getCapStorage() throws JposException;
	public boolean getCapUpdateFirmware() throws JposException;
	public boolean getCapUpdateStatistics() throws JposException;
	public boolean getCapVerticalFlip() throws JposException;
	public boolean getCapVideo() throws JposException;
	public boolean getCapVideoColorSpace() throws JposException;
	public boolean getCapVideoFrameRate() throws JposException;
	public boolean getCapVideoResolution() throws JposException;
	public boolean getCapVideoType() throws JposException;
	
	// Properties
	public boolean getAutoExposure() throws JposException;
	public void    setAutoExposure(boolean newValue) throws JposException;
	public boolean getAutoFocus() throws JposException;
	public void    setAutoFocus(boolean newValue) throws JposException;
	public boolean getAutoGain() throws JposException;
	public void    setAutoGain(boolean newValue) throws JposException;
	public boolean getAutoWhiteBalance() throws JposException;
	public void    setAutoWhiteBalance(boolean newValue) throws JposException;
	public int     getBrightness() throws JposException;
	public void    setBrightness(int newValue) throws JposException;
	public int     getContrast() throws JposException;
	public void    setContrast(int newValue) throws JposException;
	public int     getExposure() throws JposException;
	public void    setExposure(int newValue) throws JposException;
	public int     getGain() throws JposException;
	public void    setGain(int newValue) throws JposException;
	public boolean getHorizontalFlip() throws JposException;
	public void    setHorizontalFlip(boolean newValue) throws JposException;
	public int     getHue() throws JposException;
	public void    setHue(int newValue) throws JposException;
	public String  getPhotoColorSpace() throws JposException;
	public void    setPhotoColorSpace(String newValue) throws JposException;
	public String  getPhotoColorSpaceList() throws JposException;
	public int     getPhotoFrameRate() throws JposException;
	public void    setPhotoFrameRate(int newValue) throws JposException;
	public int     getPhotoMaxFrameRate() throws JposException;
	public String  getPhotoResolution() throws JposException;
	public void    setPhotoResolution(String newValue) throws JposException;
	public String  getPhotoResolutionList() throws JposException;
	public String  getPhotoType() throws JposException;
	public void    setPhotoType(String newValue) throws JposException;
	public String  getPhotoTypeList() throws JposException;
	public int     getPowerNotify() throws JposException;
	public void    setPowerNotify(int newValue) throws JposException;
	public int     getPowerState() throws JposException;
	public int     getRemainingRecordingTimeInSec() throws JposException;
	public int     getSaturation() throws JposException;
	public void    setSaturation(int newValue) throws JposException;
	public int     getStorage() throws JposException;
	public void    setStorage(int newValue) throws JposException;
	public boolean getVerticalFlip() throws JposException;
	public void    setVerticalFlip(boolean newValue) throws JposException;
	public int     getVideoCaptureMode() throws JposException;
	public void    setVideoCaptureMode(int newValue) throws JposException;
	public String  getVideoColorSpace() throws JposException;
	public void    setVideoColorSpace(String newValue) throws JposException;
	public String  getVideoColorSpaceList() throws JposException;
	public int     getVideoFrameRate() throws JposException;
	public void    setVideoFrameRate(int newValue) throws JposException;
	public int     getVideoMaxFrameRate() throws JposException;
	public String  getVideoResolution() throws JposException;
	public void    setVideoResolution(String newValue) throws JposException;
	public String  getVideoResolutionList() throws JposException;
	public String  getVideoType() throws JposException;
	public void    setVideoType(String newValue) throws JposException;
	public String  getVideoTypeList() throws JposException;
	
	// Methods
	public void    clearInput() throws JposException;
	public void    compareFirmwareVersion(String firmwareFileName, int[] result) throws JposException;
	public void    resetStatistics(String statisticsBuffer) throws JposException;
	public void    retrieveStatistics(String[] statisticsBuffer) throws JposException;
	public void    startVideo(String fileName, boolean overwrite, int recordingTime) throws JposException;
	public void    stopVideo() throws JposException;
	public void    takePhoto(String fileName, boolean overwrite, int timeout) throws JposException;
	public void    updateFirmware(String firmwareFileName) throws JposException;
	public void    updateStatistics(String statisticsBuffer) throws JposException;
	
}
