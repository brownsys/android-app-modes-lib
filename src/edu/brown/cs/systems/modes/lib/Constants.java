package edu.brown.cs.systems.modes.lib;

/**
 * @author Marcelo Martins <martins@cs.brown.edu>
 * 
 */
public class Constants {
    // Connection to middleware ComponentName
    public static final String REGISTRY_PACKAGENAME = "edu.brown.cs.systems.modes";
    public static final String REGISTRY_CLASSNAME = "edu.brown.cs.systems.modes.service.AppModeRegistry";

    // Applications supporting modes should implement the AIDL file using the following file name 
    public static final String MODE_PROXY_CLASS = "ModeProxyService";

    // Actions to implemented by middleware listener
    public static final String ACTION_REGISTER_APP = "edu.brown.cs.systems.modes.intent.action.REGISTER_APP";
    public static final String ACTION_DROP_APP = "edu.brown.cs.systems.modes.intent.action.DROP_APP";
    public static final String ACTION_APPLY_MODE = "edu.brown.cs.systems.modes.intent.action.APPLY_MODE";
}