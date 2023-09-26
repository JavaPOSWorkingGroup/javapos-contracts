/*
 * Copyright 2023 Martin Conrad
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package jpos.services;

import jpos.JposException;
import jpos.loader.JposServiceInstance;

public interface GestureControlService116 extends BaseService, JposServiceInstance {
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

    public void compareFirmwareVersion(String var1, int[] var2) throws JposException;

    public void resetStatistics(String var1) throws JposException;

    public void retrieveStatistics(String[] var1) throws JposException;

    public void updateFirmware(String var1) throws JposException;

    public void updateStatistics(String var1) throws JposException;

    public String getAutoMode() throws JposException;

    public void setAutoMode(String var1) throws JposException;

    public String getAutoModeList() throws JposException;

    public String getCapAssociatedHardTotalsDevice() throws JposException;

    public boolean getCapMotion() throws JposException;

    public boolean getCapMotionCreation() throws JposException;

    public boolean getCapPose() throws JposException;

    public boolean getCapPoseCreation() throws JposException;

    public int getCapStorage() throws JposException;

    public String getJointList() throws JposException;

    public String getMotionList() throws JposException;

    public boolean getPoseCreationMode() throws JposException;

    public void setPoseCreationMode(boolean var1) throws JposException;

    public String getPoseList() throws JposException;

    public int getStorage() throws JposException;

    public void createMotion(String fileName, String poseList) throws JposException;

    public void createPose(String fileName, int time) throws JposException;

    public void getPosition(String jointID, int[] position) throws JposException;

    public void setPosition(String positionList, int time, boolean absolute) throws JposException;

    public void setSpeed(String speedList, int time) throws JposException;

    public void startMotion(String fileName) throws JposException;

    public void startPose(String fileName) throws JposException;

    public void stopControl(int outputID) throws JposException;
}
