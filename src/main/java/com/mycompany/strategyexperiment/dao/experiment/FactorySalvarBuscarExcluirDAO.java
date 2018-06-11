/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.strategyexperiment.dao.experiment;

import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarPauta;
import com.mycompany.strategyexperiment.dao.experiment.excluir.ExcluirPauta;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarPauta;

/**
 *
 * @author Mayara
 */
public class FactorySalvarBuscarExcluirDAO {
    public AbstractSalvarBuscarExcluirDAO salvarBuscarExcluirDAO(SalvarBuscarExcluirDAOEnum salvarBuscarExcluirDaoEnum){
        switch(salvarBuscarExcluirDaoEnum){
            case PAUTA:
                return new PautaSalvarBuscarExcluirDAO(new SalvarPauta(), new BuscarPauta(), new ExcluirPauta());
            default:
                return null;
        }  
    }
}
