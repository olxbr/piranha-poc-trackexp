object FeatureToggle {
    fun isFlagEnabled(): Boolean {
        return shouldEnableFlag("experiment-name", "control")
    }

    fun isFlagEnabled(): Boolean {
        return shouldEnableFlag("experiment-name", "control") 
            && Build.VERSION.SDK_INT > Build.VERSION_CODES.M
    }
}

/*
Expected result:

object FeatureToggle {
    

    fun isFlagEnabled(): Boolean {
        return Build.VERSION.SDK_INT > Build.VERSION_CODES.M
    }
}
*/