class MyKtClass(context: Context) {
    fun MyFunc(arg1: String = null) {
        if (FeatureToggle.isFlagEnabled()) {
            useFlag()
        } else {
            print("Flag not used")
        }
    }
}


/*
Expected result:

class MyKtClass(context: Context) {
    fun MyFunc(arg1: String = null) {
        useFlag()
    }
}
*/