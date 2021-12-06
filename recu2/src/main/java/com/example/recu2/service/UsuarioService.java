package com.example.recu2.service;

import com.example.recu2.model.UsuarioModel;
import com.example.recu2.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtnerUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();

    }
    public  UsuarioModel guardarUsuario (UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

}
