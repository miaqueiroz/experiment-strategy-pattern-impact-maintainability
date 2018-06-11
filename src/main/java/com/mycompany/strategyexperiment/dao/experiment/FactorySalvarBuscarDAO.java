/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.strategyexperiment.dao.experiment;

import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarCampus;
import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarComentario;
import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarDepartamento;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarCampus;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarComentario;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarDepartamento;

/**
 *
 * @author Mayara
 */
public class FactorySalvarBuscarDAO {
    public AbstractSalvarBuscarDAO salvarBuscarDAO(SalvarBuscarDAOEnum salvarBuscarDaoEnum){
        switch(salvarBuscarDaoEnum){
            case CAMPUS:
                return new CampusSalvarBuscarDAO(new SalvarCampus(), new BuscarCampus());
            case COMENTARIO:
                return new ComentarioSalvarBuscarDAO(new SalvarComentario(), new BuscarComentario());
                
            case DEPARTAMENTO:
                return new DepartamentoSalvarBuscarDAO(new SalvarDepartamento(), new BuscarDepartamento());
            default:
                return null;
        }
    }
}
