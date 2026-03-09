package series;

class CallByValue {

    //when the copy of the value is passed as argument
    // so that no changes made to the actual value.
    //java by default uses call by value for all arguments.
    //when you pass as primitive data type it is treated as call by value

    void changeValue(int a, int b) {
        a *= 2;
        b *= 2;
    }
}

class CallByReference {
    //when you pass as reference data type it is treated as call by reference
    int refer = 33;
}

public class CallByValue_CallByReference {


    static void main(String[] args) {

        int a = 5;
        int b = 6;

        System.out.println("before: " + a + " " + b);

        CallByValue callByValue = new CallByValue();
        callByValue.changeValue(a, b);

        System.out.println("after: " + a + " " + b);

        //now call by reference example:
        CallByReference callByReference = new CallByReference();

        System.out.println("before changing: " + callByReference.refer);

        changeVal(callByReference);

        System.out.println("after changing: " + callByReference.refer);
    }

    static void changeVal(CallByReference obj) {
        obj.refer = 99;
    }
}
