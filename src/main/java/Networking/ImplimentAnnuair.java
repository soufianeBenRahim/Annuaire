package Networking;

import Metier.AnnuaireDAO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Hashtable;


/**
 *
 * @author Soufiane
 */
public class ImplimentAnnuair  extends UnicastRemoteObject implements IAnnuair{
private AnnuaireDAO Metier;
Hashtable hash;

public ImplimentAnnuair() throws RemoteException{
        super();
    }
       public ImplimentAnnuair(AnnuaireDAO _Metier) throws RemoteException{
        super();
        Metier=_Metier;
        hash = new Hashtable();
    }
    @Override
    public boolean Login(String Name, String Pass,String UsIP) throws RemoteException {
        System.out.println( "Logni Name "+Name+" pass "+Pass+" ressue");
        if( Metier.login(Name, Pass)){
        addOutputAdress(Name,UsIP);
        return true;
        }else{
        return false;
        }
    }

    @Override
    public String GetIPUser(String Psudo) throws RemoteException {
         System.out.println("GetIPUser "+Psudo);
         Object Adress=hash.get(Psudo);
         return (String) Adress;
    }

    @Override
    public boolean Desconect(String Psudo, String Pass) throws RemoteException {
     System.out.println("desconnect user : "+Psudo+"  pass "+Pass);
    if( Metier.desconnect(Psudo, Pass)){
    removeOutputAdress(Psudo);
        return true;
    }else{
    return false;
    }
    }
    private void addOutputAdress(String nom,String IP) {
        System.out.println("add contact :" + nom);
        hash.put(nom, IP);
    }

    private void removeOutputAdress(String nom) {
        System.out.println("removing outputchan " + nom);

        hash.remove(nom);
        System.out.println("removed");
    }
    
}
