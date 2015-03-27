package module.assignment_1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;


/**
 * created by amar.d on 3/26/2015
 */
public class MainActivity extends ActionBarActivity {

    static final String mGivenString = "asnmnshtadfgmnstksjdkjhasdjkaasdsadgadfgmnstsdjadaklsjdlka";
    private static final String TAG = "###MainActivity###";
    private int firstChar, repeated = 0;
    private int length;
    private char[] charArray;
    private boolean isLast = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        charArray = mGivenString.toCharArray();
        length = mGivenString.length();

        for (int i = 0; i < charArray.length; i++) {
            char myChar = charArray[i];
            Log.v(TAG, "MyChar: " + myChar);

            final String lastChar = mGivenString.substring(mGivenString.length() - 1);
            if (lastChar.equalsIgnoreCase("" + myChar))
                isLast = true;
            else
                isLast = false;

            String[] splitArray = mGivenString.split("" + myChar);
            if (splitArray.length <= 2 && !isLast) {
                Log.v(TAG, "Unique Char: " + myChar);
                break;
            }
        }

    }
}
