package com.hammam.nat3raf;

/**
 * Created by Hammam on 8/6/2017.
 */

public class ItemsData {

    private static int[] whatIsArduinoImagesID = {R.drawable.what_is_arduino_image1,
            R.drawable.what_is_arduino_image2,
            R.drawable.what_is_arduino_image3,
            R.drawable.what_is_arduino_image4};

    private static final int WHAT_IS_ARDUINI_IMAGES_NUMBER = whatIsArduinoImagesID.length;

    private static int[] developmentEnvironmentImagesID = {R.drawable.development_environment_image1,
            R.drawable.development_environment_image2,
            R.drawable.development_environment_image3,
            R.drawable.development_environment_image4,
            R.drawable.development_environment_image5,
            R.drawable.development_environment_image6,
            R.drawable.development_environment_image7,
            R.drawable.development_environment_image8,
            R.drawable.development_environment_image9};

    private static final int DEVELOPMENT_ENVIRONMENT_IMAGES_COUNT = developmentEnvironmentImagesID.length;

    private static int[] startWithAndroidImagesID = {R.drawable.start_with_arduino_image1,
            R.drawable.start_with_arduino_image2,
            R.drawable.start_with_arduino_image3,
            R.drawable.start_with_arduino_image4,
            R.drawable.start_with_arduino_image5};

    private static final int START_WITH_ARDUINO_IMAGES_NUMBER = startWithAndroidImagesID.length;

    private static int[] refrencesAndBuyImagesID = {R.drawable.refrences_and_buy_image1,
            R.drawable.refrences_and_buy_image2,
            R.drawable.refrences_and_buy_image3,
            R.drawable.refrences_and_buy_image4};

    private static int REFRENCES_AND_BUY_IMAGES_COUNT = refrencesAndBuyImagesID.length;

    private static int[] aboutUSImagesID = {R.drawable.about_us_image};

    private static int ABOUT_US_IMAGES_COUNT = aboutUSImagesID.length;

    private static int[] helpImagesID = {R.drawable.help_image};

    private static int HELP_IMAGES_COUNT = helpImagesID.length;

    public int[] activityData (String activityName) {

        int[] data = {};

        if (activityName.equals("whatIsArduino")) {
            data = whatIsArduinoImagesID;

        } else if (activityName.equals("developmentEnvironment")) {
            data = developmentEnvironmentImagesID;

        } else if (activityName.equals("startWithArduino")) {
            data = startWithAndroidImagesID;

        } else if (activityName.equals("refrences_and_buy")) {
            data = refrencesAndBuyImagesID;

        } else if (activityName.equals("about_us")){
            data = aboutUSImagesID;

        } else if (activityName.equals("help")){
            data = helpImagesID;

        }

        return data;
    }

    public int dataCount (String activityName) {

        int count = 0;

        if (activityName.equals("whatIsArduino")) {
            count = WHAT_IS_ARDUINI_IMAGES_NUMBER;

        } else if (activityName.equals("developmentEnvironment")) {
            count = DEVELOPMENT_ENVIRONMENT_IMAGES_COUNT;

        } else if (activityName.equals("startWithArduino")) {
            count = START_WITH_ARDUINO_IMAGES_NUMBER;

        } else if (activityName.equals("refrences_and_buy")) {
            count = REFRENCES_AND_BUY_IMAGES_COUNT;

        } else if (activityName.equals("about_us")){
            count = ABOUT_US_IMAGES_COUNT;

        } else if (activityName.equals("help")){
            count = HELP_IMAGES_COUNT;

        }

        return count;
    }
}
