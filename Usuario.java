package com.gnoatto.bonsaibook;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Usuario extends _Default{

    private int ID;
    private byte PerfilPlanta;
    private String Especie;
    private String Subespecie;
    private String Nascimento;
    private String Aquisicao;
    private String LocalAquisicao;
    private String Estilo;
    private String Vaso;


    public Usuario(){
        super();
        this.ID=-1;
        this.PerfilPlanta="";
        this.Especie="";
        this.Subespecie="";
        this.Nascimento="";
        this.Aquisicao="";
        this.LocalAquisicao="";
        this.Estilo="";
        this.Vaso="";
    }


    public ArrayList<Usuario> getLista() {
        DB db = new DB();
        ArrayList<Usuario> lista = new ArrayList<>();
        try {
            ResultSet resultSet = db.select("SELECT * FROM usuario");
            if (resultSet != null){
                while (resultSet.next()){
                    Usuario obj = new Usuario();
                    obj.setID(resultSet.getInt("ID"));
                    obj.setPerfilPlanta(resultSet.getByte("PerfilPlanta"));
                    obj.setEspecie(resultSet.getString("Especie"));
                    obj.setSubespecie(resultSet.getString("Subespecie"));
                    obj.setNascimento(resultSet.getString("Nascimento"));
                    obj.setAquisicao(resultSet.getString("Aquisicao"));
                    obj.setLocalAquisicao(resultSet.getString("Localaquisicao"));
                    obj.setEstilo(resultSet.getString("Estilo"));
                    obj.setVaso(resultSet.getString("Vaso"));
                    lista.add(obj);
                    obj = null;
                }

            }
        }catch (Exception ex){
            this._mensagem = ex.getMessage();
            this._status = false;
        }
        return lista;
    }

    public void salvar(){
        String comando = "";
        if (this.getID() == -1){
            comando = String.format("INSERT INTO usuario(ID, PerfilPlanta, Especie, Subespecie, Nascimento, Aquisicao, Localaquisicao, Estilo, Vaso) VALUES ('%s','%s','%s');")

        }


    }
    public void apagar(){


    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public byte getPerfilPlanta() {
        return PerfilPlanta;
    }

    public void setPerfilPlanta(byte perfilPlanta) {
        PerfilPlanta = perfilPlanta;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String especie) {
        Especie = especie;
    }

    public String getSubespecie() {
        return Subespecie;
    }

    public void setSubespecie(String subespecie) {
        Subespecie = subespecie;
    }

    public String getNascimento() {
        return Nascimento;
    }

    public void setNascimento(String nascimento) {
        Nascimento = nascimento;
    }

    public String getAquisicao() {
        return Aquisicao;
    }

    public void setAquisicao(String aquisicao) {
        Aquisicao = aquisicao;
    }

    public String getLocalAquisicao() {
        return LocalAquisicao;
    }

    public void setLocalAquisicao(String localAquisicao) {
        LocalAquisicao = localAquisicao;
    }

    public String getEstilo() {
        return Estilo;
    }

    public void setEstilo(String estilo) {
        Estilo = estilo;
    }

    public String getVaso() {
        return Vaso;
    }

    public void setVaso(String vaso) {
        Vaso = vaso;
    }

    //Todo implementar GetUsuario, Salvar e apagar

}
