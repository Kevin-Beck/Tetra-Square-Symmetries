public class Permutation {
    int[] element;
    Permutation(){
        element = new int[4];
    }
    Permutation(int a, int b, int c, int d){
        element = new int[4];
        element[0] = a-1;
        element[1] = b-1;
        element[2] = c-1;
        element[3] = d-1;
    }
    public Permutation Mutate(Permutation p)
    {
        Permutation answer = new Permutation();

        for(int i = 0; i < 4; i++)
        {
            answer.element[p.element[element[i]]] = i;
        }
        return answer;
    }
    public boolean Compare(Permutation p){
        return p.element[0] == element[0] && p.element[1] == element[1] && p.element[2] == element[2] && p.element[3] == element[3];
    }
    public String Display()
    {
        return ("[" + (element[0]+1) + ", " + (element[1]+1) + ", " + (element[2]+1) + ", " + (element[3]+1) + "]");
    }

}
