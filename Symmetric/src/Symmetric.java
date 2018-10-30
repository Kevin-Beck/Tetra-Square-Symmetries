import java.util.*;

public class Symmetric {
    public static void main(String args[]){

        List<Permutation> S = new ArrayList<Permutation>();
        List<Permutation> T = new ArrayList<Permutation>();
        List<Permutation> X = new ArrayList<Permutation>();
        List<Permutation> U = new ArrayList<Permutation>();

        Permutation Xa = new Permutation(1,2,3,4);
        Permutation Xb = new Permutation(2,1,4,3);
        Permutation Xc = new Permutation(3,4,1,2);
        Permutation Xd = new Permutation(4,3,2,1);

        Permutation Sa = new Permutation(4,1,2,3);
        Permutation Sb = new Permutation(2,3,4,1);
        Permutation Sc = new Permutation(1,4,3,2);
        Permutation Sd = new Permutation(3,2,1,4);

        Permutation Ta = new Permutation(1,3,4,2);
        Permutation Tb = new Permutation(1,4,2,3);
        Permutation Tc = new Permutation(3,2,4,1);
        Permutation Td = new Permutation(4,2,1,3);
        Permutation Te = new Permutation(2,4,3,1);
        Permutation Tf = new Permutation(4,1,3,2);
        Permutation Tg = new Permutation(2,3,1,4);
        Permutation Th = new Permutation(3,1,2,4);

        Permutation Ua = new Permutation(1,2,4,3);
        Permutation Ub = new Permutation(1,3,2,4);
        Permutation Uc = new Permutation(2,1,3,4);
        Permutation Ud = new Permutation(2,4,1,3);
        Permutation Ue = new Permutation(3,1,4,2);
        Permutation Uf = new Permutation(3,4,2,1);
        Permutation Ug = new Permutation(4,2,3,1);
        Permutation Uh = new Permutation(4,3,1,2);

        S.add(Sa);
        S.add(Sb);
        S.add(Sc);
        S.add(Sd);

        T.add(Ta);
        T.add(Tb);
        T.add(Tc);
        T.add(Td);
        T.add(Te);
        T.add(Tf);
        T.add(Tg);
        T.add(Th);

        X.add(Xa);
        X.add(Xb);
        X.add(Xc);
        X.add(Xd);

        U.add(Ua);
        U.add(Ub);
        U.add(Uc);
        U.add(Ud);
        U.add(Ue);
        U.add(Uf);
        U.add(Ug);
        U.add(Uh);

        PrintDesc();
        System.out.println("Kevin Beck - 10/29/2018");
        System.out.println("\n\n********************************************************************");
        System.out.println("\n*****The Square Permutations hit by the Unclaimed Permutations:*****");
        System.out.println("\n********************************************************************");
        for(Permutation r : S)
        {
            for(Permutation p : U)
            {
                Permutation result = r.Mutate(p);
                System.out.println("S: " + r.Display() + " composited by U: " + p.Display() + " = " + result.Display() + " which is in: " + Analyze(result, S, T, U, X));
            }
            System.out.println("");
        }

        System.out.println("\n\n*************************************************************************");
        System.out.println("\n*****The Tetrahedron Permutations hit by the Unclaimed Permutations:*****");
        System.out.println("\n*************************************************************************");

        for(Permutation r : T)
        {
            for(Permutation p : U)
            {
                Permutation result = r.Mutate(p);
                System.out.println("T: " + r.Display() + " composited with U: " + p.Display() + " = " + result.Display() + " which is in: " + Analyze(result, S, T, U, X));
            }
            System.out.println("");
        }

        System.out.println("\n\n***********************************************************************");
        System.out.println("\n*****The Unclaimed Permutations hit by the Unclaimed Permutations:*****");
        System.out.println("\n***********************************************************************");
        for(Permutation r : U)
        {
            for(Permutation p : U)
            {
                Permutation result = r.Mutate(p);
                System.out.println("U: " + r.Display() + " composited with U: " + p.Display() + " =" + result.Display() + " which is in: " + Analyze(result, S, T, U, X));
            }
            System.out.println("");
        }


        System.out.println("\n\n*****************************************************************");
        System.out.println("\n*****The Shared Permutations hit by the Shared Permutations:*****");
        System.out.println("\n*****************************************************************");
        for(Permutation r : X)
        {
            for(Permutation p : X)
            {
                Permutation result = r.Mutate(p);
                System.out.println("X: " + r.Display() + " composited with X: " + p.Display() + " = " + result.Display() + " which is in: " + Analyze(result, S, T, U, X));
            }
            System.out.println("");
        }

    }
    public static String Analyze(Permutation a, List<Permutation> s, List<Permutation> t, List<Permutation> u, List<Permutation> x)
    {
        String response = "";
        for(Permutation p : s)
        {
            if(p.Compare(a))
            {
                response += "S";
            }
        }
        for(Permutation p : t)
        {
            if(p.Compare(a))
            {
                response += "T";
            }
        }
        for(Permutation p : x)
        {
            if(p.Compare(a))
            {
                response += "X";
            }
        }
        for(Permutation p : u)
        {
            if(p.Compare(a))
            {
                response += "U";
            }
        }
        return response;
    }
    public static void PrintDesc()
    {
        System.out.println("This program calculates the compositions of various subgroups of the permutations of 1, 2, 3, 4.");
        System.out.println("The sets S represents the rotations of a square, T the rotations of a tetrahedron and X their Shared rotations.");
        System.out.println("The set U represents the rotations that are not valid for a square or a tetrahedron.");
        System.out.println("U is the focal point of this investigation as it allows you to transmute a square into a valid tetrahedron from\n" +
                "all states of the square and back again from some rotations of a tetrahedron.");
        System.out.println("Below is the data generated in full.");
    }
}
