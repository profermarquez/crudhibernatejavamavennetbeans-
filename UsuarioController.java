/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;
import Models.Usuario;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Tuple;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 *
 * @author Sebastian
 */
public class UsuarioController {

    public int getUsuarioId(String nombre, String apellido)
    {
        
        File configFilePath  = new File("cfg.xml");
            SessionFactory sessionFactory =new
                Configuration().configure(configFilePath).addAnnotatedClass(Usuario.class)
                    .buildSessionFactory();
            Session session = sessionFactory.openSession();
            int r=0;
            try{
                session.beginTransaction();
               Query query = session.createSQLQuery("select id from usuarios where nombre='"+nombre+"' and apellido='"+apellido+"'");
               
                r = Integer.parseInt(query.uniqueResult().toString());
                
                session.getTransaction().commit();
                sessionFactory.close();
                
            }
            catch(Exception e){
                e.printStackTrace();
            }
        return r;
    }
    public String createUsuario(String nombre, String apellido, String direccion)
        {
            File configFilePath  = new File("cfg.xml");
            SessionFactory sessionFactory =new
                Configuration().configure(configFilePath).addAnnotatedClass(Usuario.class)
                    .buildSessionFactory();
            Session session = sessionFactory.openSession();
            try{
                Usuario usuario = new Usuario(nombre, apellido,direccion);
                session.beginTransaction();
                session.save(usuario);
                session.getTransaction().commit();
                sessionFactory.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
            return "Usuario creado";
        }
    
    public String deleteUsuario(int id)
        {
            File configFilePath  = new File("cfg.xml");
            SessionFactory sessionFactory =new
                Configuration().configure(configFilePath).addAnnotatedClass(Usuario.class)
                    .buildSessionFactory();
            Session session = sessionFactory.openSession();
            try{ 
                session.beginTransaction();
                //System.out.println(id);
                Usuario usuario = session.get(Usuario.class,id);
                session.delete(usuario);
                session.getTransaction().commit();
                sessionFactory.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
            return "Usuario eliminado";
        }
    
    public String updateUsuario(int id,String nombre,String apellido, String direccion)
        {
            File configFilePath  = new File("cfg.xml");
            SessionFactory sessionFactory =new
                Configuration().configure(configFilePath).addAnnotatedClass(Usuario.class)
                    .buildSessionFactory();
            Session session = sessionFactory.openSession();
            try{ 
                session.beginTransaction();
                Usuario usuario = session.get(Usuario.class,id);
                usuario.setApellido(apellido);
                usuario.setDireccion(direccion);
                usuario.setNombre(nombre);
                session.update(usuario);
                session.getTransaction().commit();
                sessionFactory.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
            return "Usuario actualizado";
        }
    
    public List getUsuarios()
        {
            File configFilePath  = new File("cfg.xml");
            SessionFactory sessionFactory =new
                Configuration().configure(configFilePath).addAnnotatedClass(Usuario.class)
                    .buildSessionFactory();
            Session session = sessionFactory.openSession();
            List list=null;
            try{
                CriteriaQuery<Usuario> cq = session.getCriteriaBuilder().createQuery(Usuario.class);
                cq.from(Usuario.class);
                session.beginTransaction();
                List<Usuario> categories = session.createQuery(cq).getResultList();
                list=categories;
                session.getTransaction().commit();
                sessionFactory.close(); 
            }
            catch(Exception e){
                e.printStackTrace();
            }
            return list;
        }
}
