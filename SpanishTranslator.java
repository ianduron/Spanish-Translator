
/**
 * Spanish to English translator   
 * @author Ian Duron 
 * @version (a version number or a date)
 */

public class SpanishTranslator
{
    private String word;

    /**
     * Translates Spanish words to English
     * @param word the word you're tyring to translate
     */
    public SpanishTranslator(String word)
    {
        this.word = word;
    }

    /**
     * @return the word in Spanish
     */
    public String getSpanish()
    {
        return word;
    }

    /**
     * Sets a new word in Spanish
     * @param newWord the Spanish word you're adding
     */
    public void setSpanish(String newWord)
    {
        word = newWord;
    }

    /**
     *@return the word in English
     */
    public String getEnglish()
    {
        String english;
        if ((word.substring(0,3)).equals("el ") || (word.substring(0,3)).equals("la "))
        {
            word = word.substring(3, word.length());
        } 

        if (word.equals("estudiante"))
        {
            english = "student";
        }
        else if (word.equals("aprender"))
        {
            english = "to learn";
        }
        else if (word.equals("entender"))
        {
            english = "to understand";
        }
        else if (word.equals("verde"))
        {
            english = "green";
        }
        else
        {
            english = null;
        }   
        return english;
    }
}