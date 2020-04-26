import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import static javax.swing.JOptionPane.*;


public class LibreriaConexion {
    String url,host,port,bd,user,pass;
    Connection conn;
    Statement sql;
    boolean valido;

    public LibreriaConexion(String host, String port, String bd, String user, String pass) {
        url="";
        conn=null;
        sql=null;
        valido=false;               
        this.host = host;
        this.port = port;
        this.bd = bd;
        this.user = user;
        this.pass = pass;
    }
    
    public void conectarBaseDatos(){
        try {
            Class.forName("org.postgresql.Driver");
            url="jdbc:postgresql://"+host+":"+port+"/"+bd;
            conn=DriverManager.getConnection(url,user,pass);
            valido=conn.isValid(50000);
            
        } catch (ClassNotFoundException | SQLException ex) {
            showMessageDialog(null, "Error: "+ex.getMessage());
        }
    }
    
    public void insertarPais(String nombrePais){
        try {
            if(valido){
                sql=(Statement)conn.createStatement();
                sql.executeUpdate("INSERT INTO public.PAIS(nombrePais) VALUES('"+nombrePais+"')");
                showMessageDialog(null, "Se ha insertado correctamente NL: 10 Gerson Asael Martínez Barajas");
            }
            else showMessageDialog(null, "Se ha perdido la conexión. Verifique con el administrador");
        } catch (Exception e) {
            showMessageDialog(null,"Error: "+e.getMessage());
        }
    }
    
    public void insertarRol(String rol){
        try {
            if(valido){
                sql=(Statement)conn.createStatement();
                sql.executeUpdate("INSERT INTO public.Rol(nombreROL) VALUES('"+rol+"')");
                showMessageDialog(null, "Se ha insertado correctamente NL: 10 Gerson Asael Martínez Barajas");
            }
            else showMessageDialog(null, "Se ha perdido la conexión. Verifique con el administrador");
        } catch (Exception e) {
            showMessageDialog(null,e.getMessage());
        }
    }
    
    public void instertarEntidad(String nombreEntidad,int idPais){
        try {
            if(valido){
                sql=(Statement)conn.createStatement();
                sql.executeUpdate("INSERT INTO public.Entidad(nombreEntidad,pais_idPais) VALUES('"+nombreEntidad+"',"+idPais+")");
                showMessageDialog(null, "Se ha insertado correctamente NL: 10 Gerson Asael Martínez Barajas");
            }
            else showMessageDialog(null, "Se ha perdido la conexión. Verifique con el administrador");
        } catch (Exception e) {
            showMessageDialog(null,e.getMessage());
        }
    }
    
    public void insertarUsuario(String nombre,String correo,String pass,int idPais){
        try {
            if(valido){
                sql=(Statement)conn.createStatement();
                sql.executeUpdate("INSERT INTO public.Usuario(nombreUsuario,correoElectronico,contrasena,pais_idPais) VALUES('"+nombre+"','"+correo+"','"+pass+"',"+idPais+")");
                showMessageDialog(null, "Se ha insertado correctamente NL: 10 Gerson Asael Martínez Barajas");
            }
            else showMessageDialog(null, "Se ha perdido la conexión. Verifique con el administrador");
        } catch (Exception e) {
            showMessageDialog(null,e.getMessage());
        }
    }
    
    public void insertarUsuarioSistema(String nombre,String nombreC,char vigente,String pass,int idRol){
        try {
            if(valido){
                sql=(Statement)conn.createStatement();
                sql.executeUpdate("INSERT INTO public.UsuarioSistema(nombreUsuarioSistema,nombreCompleto,vigente,contra,rol_idRol) VALUES('"+nombre+"','"+nombreC+"','"+vigente+"','"+pass+"',"+idRol+")");
                showMessageDialog(null, "Se ha insertado correctamente NL: 10 Gerson Asael Martínez Barajas");
            }
            else showMessageDialog(null, "Se ha perdido la conexión. Verifique con el administrador");
        } catch (Exception e) {
            showMessageDialog(null,e.getMessage());
        }
    }
    
    public void insertarMarca(String marca){
        try {
            if(valido){
                sql=(Statement)conn.createStatement();
                sql.executeUpdate("INSERT INTO public.MarcaTuristica(marcaTuristica) VALUES('"+marca+"')");
                showMessageDialog(null, "Se ha insertado correctamente NL: 10 Gerson Asael Martínez Barajas");
            }
            else showMessageDialog(null, "Se ha perdido la conexión. Verifique con el administrador");
        } catch (Exception e) {
            showMessageDialog(null,"Error: "+e.getMessage());
        }
    }
    
    public void insertarPoblacion(String nombre,int idEntidad,int idMarca){
        try {
            if(valido){
                sql=(Statement)conn.createStatement();
                sql.executeUpdate("INSERT INTO public.Poblacion(nombrePoblacion,entidadFederativa_pais_idPais,marcaTuristica_idMarcaTuristica) VALUES('"+nombre+"',"+idEntidad+","+idMarca+")");
                showMessageDialog(null, "Se ha insertado correctamente NL: 10 Gerson Asael Martínez Barajas");
            }
            else showMessageDialog(null, "Se ha perdido la conexión. Verifique con el administrador");
        } catch (Exception e) {
            showMessageDialog(null,e.getMessage());
        }
    }    
    
    public void insertarLugarTuristico(String nombre,char tipo,String descripcion,byte[] codigo,int idMarca){
        try {
            if(valido){
                sql=(Statement)conn.createStatement();
                sql.executeUpdate("INSERT INTO public.LugarTuristico"
                        + "(nombrePoblacion,tipoLugar,descripcion,codigoQR,marcaTuristica_idMarcaTuristica) "
                        + "VALUES('"+nombre+"','"+tipo+"','"+descripcion+"',"+codigo+","+idMarca+")");
                showMessageDialog(null, "Se ha insertado correctamente NL: 10 Gerson Asael Martínez Barajas");
            }
            else showMessageDialog(null, "Se ha perdido la conexión. Verifique con el administrador");
        } catch (Exception e) {
            showMessageDialog(null,e.getMessage());
        }
    }
    
    public void insertarVisita(String comentarios,int idUsiario,int idLugar){
        try {
            if(valido){
                sql=(Statement)conn.createStatement();
                sql.executeUpdate("INSERT INTO public.Visita"
                        + "(comentarios,usuario_idUsuario,LugarTuristico_idLugarTuristico)"
                        + "VALUES('"+comentarios+"',"+idUsiario+","+idLugar+")");
                showMessageDialog(null, "Se ha insertado correctamente NL: 10 Gerson Asael Martínez Barajas");
            }
            else showMessageDialog(null, "Se ha perdido la conexión. Verifique con el administrador");
        } catch (Exception e) {
            showMessageDialog(null,e.getMessage());
        }
    }
    
    
    public ArrayList<Object[]> mostrarVisita() throws SQLException{
        ResultSet rs=null;
        ArrayList<Object[]> lista=new ArrayList<>();        
        sql=(Statement)conn.createStatement();
        rs=sql.executeQuery("SELECT fechavisita,comentarios,U.nombreusuario,L.nombrepoblacion\n" +
                            "FROM public.visita as v INNER JOIN public.usuario as U \n" +
                            "ON U.idusuario = v.usuario_idusuario\n" +
                            "INNER JOIN lugarturistico as L\n" +
                            "ON L.idlugarturistico = lugarturistico_idlugarturistico;");
        while(rs.next()){
            Object[] arr={
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4)
            };
            lista.add(arr);
        }        
        return lista;
    }
    
    public ArrayList<Object[]> mostrarLugar() throws SQLException{
        ResultSet rs=null;
        ArrayList<Object[]> lista=new ArrayList<>();        
        sql=(Statement)conn.createStatement();
        rs=sql.executeQuery("SELECT idlugarturistico, nombrepoblacion, tipolugar, descripcion, codigoqr,mt.marcaturistica\n" +
                            "FROM public.lugarturistico \n" +
                            "INNER JOIN marcaturistica as mt\n" +
                            "ON mt.idmarcaturistica = marcaturistica_idmarcaturistica;\n");
        while(rs.next()){
            Object[] arr={
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6)
            };
            lista.add(arr);
        }        
        return lista;
    }
    
    public void addComboBox(JComboBox combobox,String tabla,int columna) throws SQLException{
        ResultSet rs=null;        
        sql=(Statement)conn.createStatement();
        rs=sql.executeQuery("SELECT * FROM public."+tabla);                            
        while(rs.next()){
            combobox.addItem(rs.getString(columna));
        }        
    }
    
    public ArrayList<Object[]> mostrarPais() throws SQLException{
        ResultSet rs=null;
        ArrayList<Object[]> lista=new ArrayList<>();        
        sql=(Statement)conn.createStatement();
        rs=sql.executeQuery("SELECT * FROM public.PAIS");
        while(rs.next()){
            Object[] arr={
                rs.getInt(1),
                rs.getString(2)                
            };
            lista.add(arr);
        }        
        return lista;
    }
    
    public int obtenerId(String pais){
        Statement sentencia;
        ResultSet datos=null;
        int id=0;
        if(valido){
            showMessageDialog(null, "Se ha conectado a la BD");
            try {
                sentencia=conn.createStatement();
                datos=sentencia.executeQuery("select idPais from pais where nombrepais = '"+pais+"'");
                while(datos.next())id=datos.getInt(1);
            } catch (Exception e) {
                showMessageDialog(null,"Se ha perdido la conexión "+e.getMessage());
            }                    
        }                
        return id;
    }    
}
