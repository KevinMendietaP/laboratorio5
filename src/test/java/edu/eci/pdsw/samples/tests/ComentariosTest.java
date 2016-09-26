/*
 * Copyright (C) 2016 hcadavid
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.pdsw.samples.tests;

import edu.eci.pdsw.samples.services.ExcepcionServiciosForos;
import edu.eci.pdsw.samples.services.ServiciosForo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hcadavid
 */
public class ComentariosTest {
    
    public ComentariosTest() {
    /*PRUEBAS DE EQUIVALENCIA
   
    - El identificador no corresponde al usuario
    - EL Identificador es  menor a 0*/
    }
    private ServiciosForo nuevo;
    @Before
    public void setUp() {
        nuevo = nuevo.getInstance();
    }
    
    @Test
    public void registroPacienteTest(){
        int id= 1;
        try{
        nuevo.consultarEntradaForo(id);
         fail();
        }catch(ExcepcionServiciosForos e){
            assertTrue("No se encuentra Usuario asociado a este id"+id,true);
        }
    }
    }
    
    

