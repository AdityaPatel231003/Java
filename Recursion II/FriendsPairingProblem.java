public class FriendsPairingProblem {
    public static void main(String[] args) {
        int n=4;
    System.out.println(Pairing(n));
    }
public static  int Pairing(int n){
    if(n==1 || n==2){
        return n;
    }

    int single=Pairing(n-1);
    int pairing=(n-1)*Pairing(n-2);
    return single+pairing;
}
}
