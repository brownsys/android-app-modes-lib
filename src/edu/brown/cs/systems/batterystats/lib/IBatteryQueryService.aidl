package edu.brown.cs.systems.batterystats.lib;

interface IBatteryQueryService {

    void setPowerProfile(int powerProfile);

    /**
     * Get battery remaining time (in seconds) from current running profile
     * @return
     */
    long getBatteryRemainingTime();

    /**
     * Get batt remaining times (secs) given a power profile (mW)
     * @param appList
     * @return 
     */
    long estimateRemainingTime(int powerProfile);
}