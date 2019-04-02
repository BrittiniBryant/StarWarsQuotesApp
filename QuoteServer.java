package com.example.quotes;

import android.os.Build;
import android.support.annotation.RequiresApi;


import static java.util.concurrent.ThreadLocalRandom.current;

public class QuoteServer {

    String[] getQuotes() {
        String[] quotes= new String[]{
                "Great leaders inspire greatness in others.", "Belief is not a matter of choice, but of conviction.",
                "Easy is the path to wisdom for those not blinded by ego.", "A plan is only as good as those who see it through.",
                "The best confidence builder is experience.", "Trust in your friends and they'll have a reason to trust in you.",
                "You hold onto friends by keeping your heart a little softer than your head.", "Heroes are made by the times.",
                "Ignore your instincts at your peril.", "Most powerful is he/she who controls his/her own power",
                "The winding path to peace is always a worthy one, regardless of how many turns it takes.",
                "Fail with honor rather than succeed by fraud.", "Greed and fear of loss are the roots that lead to the tree of evil.",
                "When surrounded by war, one must eventually choose a side.", "Arrogance diminishes wisdom.",
                "Truth enlightens the mind, but won't always bring happiness to your heart.",
                "Fear is a disease; hope is it's only cure.", "A single chance is a galaxy of hope.",
                "It's a rough road that leads to the heights of greatness.", "The costs of war can never truly be accounted for.",
                "Compromise is a virtue to be cultivated, not a weakness to be despised.", "A secret shared is a trust formed.",
                "The first step to correcting a mistake is patience.", "A true heart should never be doubted.",
                "Believe in yourself or no one else will.", "No gift is more precious than trust.", "Attachment is not compassion.",
                "For everything you gain, you lose something else.", "Easy isn't always simple.", "If you ignore the past, you jeopardize the future.",
                "Fear not for the future, weep not for the past.", "In war, truth is the first casualty.",
                "Searching for the truth is easy. Accepting the truth is hard.", "A wise leader knows when to follow.",
                "Courage makes heroes, but trust builds friendship.", "Choose what is right, not what is easy.",
                "The most dangerous beast is the beast within.", "Who my mother was matters less than my memory of her.",
                "Adversity is a friendship's truest test.",
        };
        return quotes;
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    String getRandomQuote() {
        String quote;
        int quotesArrayLen = getQuotes().length;
        int randomNum = current().nextInt(quotesArrayLen);
        quote = getQuotes()[randomNum];
        return quote;
    }

}
