

package jpos;

/**
 * All constants extracted from OPOS header OposDmon.h
 */
public interface DeviceMonitorConst {
    // AddMonitoringDevice

    public static final int DMON_MMODE_UPDATE          = 1;
    public static final int DMON_MMODE_STRADDLED       = 2;
    public static final int DMON_MMODE_HIGH            = 3;
    public static final int DMON_MMODE_LOW             = 4;
    public static final int DMON_MMODE_WITHIN          = 5;
    public static final int DMON_MMODE_OUTSIDE         = 6;
    public static final int DMON_MMODE_POLLING         = 7;

    // StatusUpdateEvent

    public static final int DMON_SUE_START_MONITORING  = 11;
    public static final int DMON_SUE_STOP_MONITORING   = 12;
}
