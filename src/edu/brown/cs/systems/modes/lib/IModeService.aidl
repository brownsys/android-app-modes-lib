package edu.brown.cs.systems.modes.lib;

import java.util.List;
import edu.brown.cs.systems.modes.data.ModeData;

interface IModeService {
    /**
     * Set application mode
     * @param modeId    mode ID
     * @return true if everything went OK
     */
    boolean setMode(long modeId);

    /**
     * Get available modes
     * @return list of available mode resources
     */
    List<ModeData> getModes();
}