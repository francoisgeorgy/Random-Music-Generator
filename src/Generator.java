import jm.JMC;
import jm.music.data.*;
import jm.util.*;

import java.util.ArrayList;
import java.util.Random;

public class Generator implements JMC
{
    void Generatev1()
    {
        //Generates a song using exactly 8 notes
        Score score = new Score();
        Part part = new Part("Piano", SYNTH_BASS);
        Phrase phrase = new Phrase();
        int songLength = 100;

        int[] notes = {C3, D3, E3, F3, G3, A4, B4, C4};
        int i = 0;
        double c = 7 / 8;
        double d = 1 / 8;

        Random rand = new Random();
        for (int a = 0; a < songLength; a++)
        {
            double r = rand.nextGaussian() / 3;

            System.out.println(r + ", " + i);

            switch (i)
            {
                case 0:
                    r = Math.abs(r);

                    if (r < (double) 2 / 8)
                    {
                        i += 1;
                    }
                    else if (r < (double) 3 / 8)
                    {
                        i += 2;
                    }
                    else if (r < (double) 4 / 8)
                    {
                        i += 3;
                    }
                    else if (r < (double) 5 / 8)
                    {
                        i += 4;
                    }
                    else if (r < (double) 6 / 8)
                    {
                        i += 5;
                    }
                    else if (r < (double) 7 / 8)
                    {
                        i += 6;
                    }
                    else
                    {
                        i += 7;
                    }
                    break;

                case 1:
                    if (r > (double) (-1 / 7) * c - d && r <= -d)
                    {
                        i -= 1;
                        break;
                    }

                    r = Math.abs(r);

                    if (r < (double) (2 / 7) * c + c)
                    {
                        i += 1;
                    }
                    else if (r < (double) (3 / 7) * c + c)
                    {
                        i += 2;
                    }
                    else if (r < (double) (4 / 7) * c + c)
                    {
                        i += 3;
                    }
                    else if (r < (double) (5 / 7) * c + c)
                    {
                        i += 4;
                    }
                    else if (r < (double) (6 / 7) * c + c)
                    {
                        i += 5;
                    }
                    else
                    {
                        i += 6;
                    }
                    break;

                case 2:
                    if (r > (double) (-2 / 7) * c - d && r < (double) (-1 / 7) * c - d)
                    {
                        i -= 2;
                        break;
                    }
                    else if (r > (double) (-1 / 7) * c - d && r <= -d)
                    {
                        i -= 1;
                        break;
                    }

                    r = Math.abs(r);

                    if (r < (double) (3 / 7) * c + c)
                    {
                        i += 1;
                    }
                    else if (r < (double) (4 / 7) * c + c)
                    {
                        i += 2;
                    }
                    else if (r < (double) (5 / 7) * c + c)
                    {
                        i += 3;
                    }
                    else if (r < (double) (6 / 7) * c + c)
                    {
                        i += 4;
                    }
                    else
                    {
                        i += 5;
                    }
                    break;

                case 3:
                    if (r > (double) (-3 / 7) * c - d && r < (double) (-2 / 7) * c - d)
                    {
                        i -= 3;
                        break;
                    }
                    else if (r > (double) (-2 / 7) * c - d && r < (double) (-1 / 7) * c - d)
                    {
                        i -= 2;
                        break;
                    }
                    else if (r > (double) (-1 / 7) * c - d && r < -d)
                    {
                        i -= 1;
                        break;
                    }

                    r = Math.abs(r);

                    if (r < (double) (4 / 7) * c + c)
                    {
                        i += 1;
                    }
                    else if (r < (double) (5 / 7) * c + c)
                    {
                        i += 2;
                    }
                    else if (r < (double) (6 / 7) * c + c)
                    {
                        i += 3;
                    }
                    else
                    {
                        i += 4;
                    }
                    break;

                case 4:
                    if (r > (double) (-4 / 7) * c - d && r < (double) (-3 / 7) * c - d)
                    {
                        i -= 4;
                        break;
                    }
                    else if (r > (double) (-3 / 7) * c - d && r < (double) (-2 / 7) * c - d)
                    {
                        i -= 3;
                        break;
                    }
                    else if (r > (double) (-2 / 7) * c - d && r < (double) (-1 / 7) * c - d)
                    {
                        i -= 2;
                        break;
                    }
                    else if (r > (double) (-1 / 7) * c - d && r < -d)
                    {
                        i -= 1;
                        break;
                    }

                    r = Math.abs(r);

                    if (r < (double) (5 / 7) * c + c)
                    {
                        i += 1;
                    }
                    else if (r < (double) (6 / 7) * c + c)
                    {
                        i += 2;
                    }
                    else
                    {
                        i += 3;
                    }
                    break;

                case 5:
                    if (r > (double) (-5 / 7) * c - d && r < (double) (-4 / 7) * c - d)
                    {
                        i -= 5;
                        break;
                    }
                    else if (r > (double) (-4 / 7) * c - d && r < (double) (-3 / 7) * c - d)
                    {
                        i -= 4;
                        break;
                    }
                    else if (r > (double) (-3 / 7) * c - d && r < (double) (-2 / 7) * c - d)
                    {
                        i -= 3;
                        break;
                    }
                    else if (r > (double) (-2 / 7) * c - d && r < (double) (-1 / 7) * c - d)
                    {
                        i -= 2;
                        break;
                    }
                    else if (r > (double) (-1 / 7) * c - d && r < -d)
                    {
                        i -= 1;
                        break;
                    }

                    r = Math.abs(r);

                    if (r < (double) (6 / 7) * c + c)
                    {
                        i += 1;
                    }
                    else
                    {
                        i += 2;
                    }

                case 6:
                    if (r > (double) (-6 / 7) * c - d && r < (double) (-5 / 7) * c - d)
                    {
                        i -= 6;
                        break;
                    }
                    else if (r > (double) (-5 / 7) * c - d && r < (double) (-4 / 7) * c - d)
                    {
                        i -= 5;
                        break;
                    }
                    else if (r > (double) (-4 / 7) * c - d && r < (double) (-3 / 7) * c - d)
                    {
                        i -= 4;
                        break;
                    }
                    else if (r > (double) (-3 / 7) * c - d && r < (double) (-2 / 7) * c - d)
                    {
                        i -= 3;
                        break;
                    }
                    else if (r > (double) (-2 / 7) * c - d && r < (double) (-1 / 7) * c - d)
                    {
                        i -= 2;
                        break;
                    }
                    else if (r > (double) (-1 / 7) * c - d && r < -d)
                    {
                        i -= 1;
                        break;
                    }

                    r = Math.abs(r);

                    if (r < 1 - d)
                    {
                        i += 1;
                    }

                case 7:
                    r = Math.abs(r);

                    if (r < (double) 2 / 8)
                    {
                        i -= 1;
                    }
                    else if (r < (double) 3 / 8)
                    {
                        i -= 2;
                    }
                    else if (r < (double) 4 / 8)
                    {
                        i -= 3;
                    }
                    else if (r < (double) 5 / 8)
                    {
                        i -= 4;
                    }
                    else if (r < (double) 6 / 8)
                    {
                        i -= 5;
                    }
                    else if (r < (double) 7 / 8)
                    {
                        i -= 6;
                    }
                    else
                    {
                        i -= 7;
                    }

                    break;
            }

            Note note = new Note(notes[i], MINIM / 8);
            phrase.add(note);
        }

        part.addPhrase(phrase);
        score.addPart(part);

        Play.midi(score);
    }

    void Generatev2()
    {
        //Generates a song using any number of notes
        Score score = new Score();
        Part part = new Part("Synth1", SYNTH_BASS);
        Phrase phrase = new Phrase();
        int songLength = 100;

        int[] notes = {C2, D2, E2, F2, G2, A3, B3,
                C3, E3, F3, G3, A4, B4, C4};
        int i = 0;
        double c = (double) (notes.length - 1) / notes.length;
        double d = (double) 1 / notes.length;

        double noteLength = .25;
        double maxNoteLength = .85d;
        double minNoteLength = .1d;

        Random rand = new Random();
        double l = Math.abs(rand.nextGaussian() / 6 * noteLength);

        for (int a = 0; a < songLength; a++)
        {

            //<editor-fold desc="Determine pitch values">
            double r = rand.nextGaussian() / 3;

            for (int j = -notes.length + 1; j < -d; j++)
            {
                if (r > ((j / (double) (notes.length - 1)) * c - d) && r < (((j + 1) / (double) (notes.length - 1)) * c - d))
                {
                    if (i - j < 0)
                    {
                        i += j;
                    }
                    else
                    {
                        i -= j;
                    }
                    break;
                }
            }

            for (int j = 0; j < notes.length; j++)
            {
                if (r < (j / (double) (notes.length - 1)) * c + d)
                {
                    if (i + j > notes.length - 1)
                    {
                        i -= j;
                    }
                    else
                    {
                        i += j;
                    }
                    break;
                }
            }

            while (i < 0)
            {
                i += notes.length - 1;
            }

            while (i > notes.length - 1)
            {
                i -= notes.length - 1;
            }
            //</editor-fold>

            r = rand.nextGaussian() / 3 * noteLength;
            if (r < 0)
            {
                if (l - r > minNoteLength)
                {
                    if (rand.nextDouble() > .5)
                        l += r;
                    else
                        l -= r;
                }
                else
                {
                    l -= r;
                }
            }
            if (r > 0)
            {
                if (l + r < maxNoteLength)
                {
                    if (rand.nextDouble() > .5)
                        l += r;
                    else
                        l -= r;
                }
                else
                {
                    l -= r;
                }
            }

            while (l <= minNoteLength)
            {
                l += minNoteLength;
            }
            while (l >= maxNoteLength)
            {
                l -= minNoteLength;
            }

            Note note = new Note(notes[i], l);
            phrase.addNote(note);
        }

        part.addPhrase(phrase);
        score.addPart(part);

        Write.midi(score);
        Play.midi(score);
    }

    void Generatev3(int numberOfPhrases, int maxPhraseLength, int minPhraseLength, int songLength, double maxNoteLength, double minNoteLength, int[] notes, Part part, int maxRandTime)
    {
        //Generates multiple phrases,
        //then adds them to a song
        Score score = new Score();

        Phrase[] phrases = new Phrase[numberOfPhrases];
        int[] phraseStartNotes = new int[numberOfPhrases];
        int[] phraseEndNotes = new int[numberOfPhrases];

        int i = 0;
        double c = (double) (notes.length - 1) / notes.length;
        double d = (double) 1 / notes.length;

        double initalNoteLength = .25;

        Random rand = new Random();
        double l = Math.abs(rand.nextGaussian() / 6 * initalNoteLength);

        for (int p = 0; p < numberOfPhrases; p++)
            phrases[p] = new Phrase();

        for (int p = 0; p < numberOfPhrases; p++)
        {
            int phraseLength = rand.nextInt(maxPhraseLength - minPhraseLength + 1) + minPhraseLength;
            for (int n = 0; n < phraseLength; n++)
            {
                //<editor-fold desc="Generate Phrase"
                //<editor-fold desc="Determine note pitch">
                double r = rand.nextGaussian() / 3;

                for (int j = -notes.length + 1; j < -d; j++)
                {
                    if (r > ((j / (double) (notes.length - 1)) * c - d) && r < (((j + 1) / (double) (notes.length - 1)) * c - d))
                    {
                        if (i - j < 0)
                        {
                            i += j;
                        }
                        else
                        {
                            i -= j;
                        }
                        break;
                    }
                }

                for (int j = 0; j < notes.length; j++)
                {
                    if (r < (j / (double) (notes.length - 1)) * c + d)
                    {
                        if (i + j > notes.length - 1)
                        {
                            i -= j;
                        }
                        else
                        {
                            i += j;
                        }
                        break;
                    }
                }

                while (i < 0)
                {
                    i += notes.length - 1;
                }

                while (i > notes.length - 1)
                {
                    i -= notes.length - 1;
                }
                //</editor-fold>

                //<editor-fold desc="Determine note length">
                r = rand.nextGaussian() / 3 * initalNoteLength;
                if (r < 0)
                {
                    if (l - r > minNoteLength)
                    {
                        if (rand.nextDouble() > .5)
                            l += r;
                        else
                            l -= r;
                    }
                    else
                    {
                        l -= r;
                    }
                }
                if (r > 0)
                {
                    if (l + r < maxNoteLength)
                    {
                        if (rand.nextDouble() > .5)
                            l += r;
                        else
                            l -= r;
                    }
                    else
                    {
                        l -= r;
                    }
                }

                while (l <= minNoteLength)
                {
                    l += minNoteLength;
                }
                while (l >= maxNoteLength)
                {
                    l -= minNoteLength;
                }
                //</editor-fold>

                if (n == 0)
                    phraseStartNotes[p] = notes[i];
                else if (n == phraseLength - 1)
                    phraseEndNotes[p] = notes[i];

                Note note = new Note(notes[i], l);
                phrases[p].addNote(note);
                //</editor-fold>
            }
        }

        int previousPart = rand.nextInt(numberOfPhrases);

        for (int p = 0; p < songLength; p++)
        {
            part.add(phrases[previousPart]);
            double rg = Math.abs(rand.nextGaussian() / 3);
            int r = rand.nextInt(numberOfPhrases);
            int t = 0;
            while (Math.abs(phraseEndNotes[previousPart] - phraseStartNotes[r]) / Math.abs(notes[notes.length - 1] / notes[0]) > rg)
            {
                if (t >= maxRandTime)
                {
                    rg = Math.abs(rand.nextGaussian() / 3);
                    t = 0;
                }
                r = rand.nextInt(numberOfPhrases);
                t++;
            }
            previousPart = r;
        }

        score.add(part);

        Play.midi(score);
    }

    public static void main(String[] args)
    {
        Generator generator = new Generator();

        int numberOfPhrases = 5;
        int maxPhraseLength = 15;
        int minPhraseLength = 5;
        int songLength = 999;

        double maxNoteLength = .85d;
        double minNoteLength = .1d;

        int[] notes = {C3, D3, E3, F3, G3, A4, B4, C4};
        Part part = new Part("Synth1", SAW);

        generator.Generatev3(numberOfPhrases, maxPhraseLength, minPhraseLength, songLength, maxNoteLength, minNoteLength, notes, part, 10);
    }
}
