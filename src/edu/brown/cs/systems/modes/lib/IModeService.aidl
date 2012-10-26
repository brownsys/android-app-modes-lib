package edu.brown.cs.systems.modes.lib;

import java.util.List;
import edu.brown.cs.systems.modes.lib.data.ModeData;

interface IModeService {
    /**
     * Set application mode
     * @param modeName    mode name
     * @return true if everything went OK
     */
    boolean setMode(String modeName);

    /**
     * Get available modes
     * @return list of available mode resources
     */
    List<ModeData> getModes();
}