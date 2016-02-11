import jm.JMC;
import jm.music.data.*;
import jm.util.*;

import java.util.Random;

/* --------------------
* A class for making music from Cellular Automata clculations
* @author Andrew Troedson and Andrew Brown
* ---------------------
*/

public class Generator implements JMC
{
    void Generatev1()
    {
        Score score = new Score();
        Part part = new Part("Piano", SYNTH_BASS);
        Phrase phrase = new Phrase();
        int songLength = 100;

        int[] notes = {C3, D3, E3, F3, G3, A4, B4, C4};
        int i = 0;
        double c = 7/8;
        double d = 1/8;

        Random rand = new Random();
        for (int a=0; a < songLength; a++)
        {
            double r = rand.nextGaussian()/3;
            //double r = rand.nextFloat()*2-1;

            System.out.println(r + ", " + i);

            switch (i)
            {
                case 0:
                    r = Math.abs(r);

                    if (r < d){}
                    else if (r < (double)2/8)
                    {
                        i += 1;
                    }
                    else if (r < (double)3/8)
                    {
                        i += 2;
                    }
                    else if (r < (double)4/8)
                    {
                        i += 3;
                    }
                    else if (r < (double)5/8)
                    {
                        i += 4;
                    }
                    else if (r < (double)6/8)
                    {
                        i += 5;
                    }
                    else if (r < (double)7/8)
                    {
                        i += 6;
                    }
                    else
                    {
                        i += 7;
                    }
                    break;

                case 1:
                    if (r > (double)(-1/7)*c-d && r <= -d)
                    {
                        i -= 1;
                        break;
                    }

                    r = Math.abs(r);

                    if (r < d){}
                    else if (r < (double)(2/7)*c+c)
                    {
                        i += 1;
                    }
                    else if (r < (double)(3/7)*c+c)
                    {
                        i += 2;
                    }
                    else if (r < (double)(4/7)*c+c)
                    {
                        i += 3;
                    }
                    else if (r < (double)(5/7)*c+c)
                    {
                        i += 4;
                    }
                    else if (r < (double)(6/7)*c+c)
                    {
                        i += 5;
                    }
                    else
                    {
                        i += 6;
                    }
                    break;

                case 2:
                    if (r > (double)(-2/7)*c-d && r < (double)(-1/7)*c-d)
                    {
                        i -= 2;
                        break;
                    }
                    else if (r > (double)(-1/7)*c-d && r <= -d)
                    {
                        i -= 1;
                        break;
                    }

                    r = Math.abs(r);

                    if (r < d){}
                    else if (r < (double)(3/7)*c+c)
                    {
                        i += 1;
                    }
                    else if (r < (double)(4/7)*c+c)
                    {
                        i += 2;
                    }
                    else if (r < (double)(5/7)*c+c)
                    {
                        i += 3;
                    }
                    else if (r < (double)(6/7)*c+c)
                    {
                        i += 4;
                    }
                    else
                    {
                        i += 5;
                    }
                    break;

                case 3:
                    if (r > (double)(-3/7)*c-d && r < (double)(-2/7)*c-d)
                    {
                        i -= 3;
                        break;
                    }
                    else if (r > (double)(-2/7)*c-d && r < (double)(-1/7)*c-d)
                    {
                        i -= 2;
                        break;
                    }
                    else if (r > (double)(-1/7)*c-d && r < -d)
                    {
                        i -= 1;
                        break;
                    }

                    r = Math.abs(r);

                    if (r < d){}
                    else if (r < (double)(4/7)*c+c)
                    {
                        i += 1;
                    }
                    else if (r < (double)(5/7)*c+c)
                    {
                        i += 2;
                    }
                    else if (r < (double)(6/7)*c+c)
                    {
                        i += 3;
                    }
                    else
                    {
                        i += 4;
                    }
                    break;

                case 4:
                    if (r > (double)(-4/7)*c-d && r < (double)(-3/7)*c-d)
                    {
                        i -= 4;
                        break;
                    }
                    else if (r > (double)(-3/7)*c-d && r < (double)(-2/7)*c-d)
                    {
                        i -= 3;
                        break;
                    }
                    else if (r > (double)(-2/7)*c-d && r < (double)(-1/7)*c-d)
                    {
                        i -= 2;
                        break;
                    }
                    else if (r > (double)(-1/7)*c-d && r < -d)
                    {
                        i -= 1;
                        break;
                    }

                    r = Math.abs(r);

                    if (r < d){}
                    else if (r < (double)(5/7)*c+c)
                    {
                        i += 1;
                    }
                    else if (r < (double)(6/7)*c+c)
                    {
                        i += 2;
                    }
                    else
                    {
                        i += 3;
                    }
                    break;

                case 5:
                    if (r > (double)(-5/7)*c-d && r < (double)(-4/7)*c-d)
                    {
                        i -= 5;
                        break;
                    }
                    else if (r > (double)(-4/7)*c-d && r < (double)(-3/7)*c-d)
                    {
                        i -= 4;
                        break;
                    }
                    else if (r > (double)(-3/7)*c-d && r < (double)(-2/7)*c-d)
                    {
                        i -= 3;
                        break;
                    }
                    else if (r > (double)(-2/7)*c-d && r < (double)(-1/7)*c-d)
                    {
                        i -= 2;
                        break;
                    }
                    else if (r > (double)(-1/7)*c-d && r < -d)
                    {
                        i -= 1;
                        break;
                    }

                    r = Math.abs(r);

                    if (r < d){}
                    else if (r < (double)(6/7)*c+c)
                    {
                        i += 1;
                    }
                    else
                    {
                        i += 2;
                    }

                case 6:
                    if (r > (double)(-6/7)*c-d && r < (double)(-5/7)*c-d)
                    {
                        i -= 6;
                        break;
                    }
                    else if (r > (double)(-5/7)*c-d && r < (double)(-4/7)*c-d)
                    {
                        i -= 5;
                        break;
                    }
                    else if (r > (double)(-4/7)*c-d && r < (double)(-3/7)*c-d)
                    {
                        i -= 4;
                        break;
                    }
                    else if (r > (double)(-3/7)*c-d && r < (double)(-2/7)*c-d)
                    {
                        i -= 3;
                        break;
                    }
                    else if (r > (double)(-2/7)*c-d && r < (double)(-1/7)*c-d)
                    {
                        i -= 2;
                        break;
                    }
                    else if (r > (double)(-1/7)*c-d && r < -d)
                    {
                        i -= 1;
                        break;
                    }

                    r = Math.abs(r);

                    if (r < d){}
                    else if (r < 1-d)
                    {
                        i += 1;
                    }

                case 7:
                    r = Math.abs(r);

                    if (r < d){}
                    else if (r < (double)2/8)
                    {
                        i -= 1;
                    }
                    else if (r < (double)3/8)
                    {
                        i -= 2;
                    }
                    else if (r < (double)4/8)
                    {
                        i -= 3;
                    }
                    else if (r < (double)5/8)
                    {
                        i -= 4;
                    }
                    else if (r < (double)6/8)
                    {
                        i -= 5;
                    }
                    else if (r < (double)7/8)
                    {
                        i -= 6;
                    }
                    else
                    {
                        i -= 7;
                    }

                    break;
            }

            Note note = new Note(notes[i], MINIM/8);
            phrase.add(note);
        }

        part.addPhrase(phrase);
        score.addPart(part);

        Play.midi(score);
    }

    void Generatev2()
    {
        Score score = new Score();
        Part part = new Part("Piano", SYNTH_BASS);
        Phrase phrase = new Phrase();
        int songLength = 100;

        int[] notes = {C2, D2, EF2, F2, G2, AF3, BF3, C3, D3, EF3, F3, G3, AF4, BF4};
        int i = 0;
        double c = (double)(notes.length-1)/notes.length;
        double d = (double)1/notes.length;

        double noteLength = .25;
        double maxNoteLength = .85d;
        double minNoteLength = .05d;

        System.out.println(c + ", " + d);

        Random rand = new Random();
        double l = Math.abs(rand.nextGaussian()/6*noteLength);
        for (int a = 0; a < songLength; a++) {

            //<editor-fold desc="Determine pitch values">
            double r = rand.nextGaussian() / 3;

            for (int j = -notes.length + 1; j < -d; j++) {
                if (r > ((j / (double) (notes.length - 1)) * c - d) && r < (((j+1) / (double) (notes.length - 1))*c-d)) {
                    if (i - j < 0) {
                        i += j;
                    } else {
                        i -= j;
                    }
                    break;
                }
            }

            for (int j = 0; j < notes.length; j++) {
                if (r < (j / (double)(notes.length-1)) * c + d) {
                    if (i + j > notes.length - 1) {
                        i -= j;
                    } else {
                        i += j;
                    }
                    break;
                }
            }

            while (i < 0) {
                i += notes.length - 1;
            }

            while (i > notes.length - 1) {
                i -= notes.length - 1;
            }
            //</editor-fold>

            r = rand.nextGaussian()/3*noteLength;
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

            System.out.println(l + ", " + r);

            Note note = new Note(notes[i], l);
            phrase.addNote(note);/**/
        }


        part.addPhrase(phrase);
        score.addPart(part);

        Play.midi(score);
    }

    public static void main(String[] args)
    {
        Generator generator = new Generator();
        generator.Generatev2();
    }
}
