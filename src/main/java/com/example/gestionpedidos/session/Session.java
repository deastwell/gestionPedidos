package com.example.gestionpedidos.session;
import com.example.gestionpedidos.modelos.Pedido;
import com.example.gestionpedidos.modelos.Usuario;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Session {

    @Setter
    @Getter
    private static Usuario usuarioActual;

    @Setter
    @Getter
    private static Pedido pedidoPulsado;





}