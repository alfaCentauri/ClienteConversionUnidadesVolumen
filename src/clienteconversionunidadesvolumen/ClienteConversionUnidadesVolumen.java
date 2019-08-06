/*
 * Copyright (C) 2019 Ingeniero em Compuación Ricardo Presilla.
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
package clienteconversionunidadesvolumen;

/**
 * Implementación de un cliente del servicio web de conversión de unidades.
 * @author Ingeniero en Computación: Ricardo Presilla.
 * @version 1.0.
 */
public class ClienteConversionUnidadesVolumen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double litros=1, galones=1;
        System.out.println("Demostración de un cliente en Java SE para un servicio web con JAX-WS.");
        System.out.printf("%f galones son %f litros.\n", galones, galonesALitros(galones));
        System.out.printf("%f litros son %f galones.\n", litros, litrosAGalones(litros));
    }
    /**
     * LLama al servicio web para convertir galones a litros.
     * @param galones   Tipo double.
     * @return Tipo double.
     */
    private static double galonesALitros(double galones) {
        convertirunidadesvolumen.ConvertirUnidadesVolumen_Service service = new convertirunidadesvolumen.ConvertirUnidadesVolumen_Service();
        convertirunidadesvolumen.ConvertirUnidadesVolumen port = service.getConvertirUnidadesVolumenPort();
        return port.galonesALitros(galones);
    }
    /**
     * LLama al servicio web para convertir litros a galones.
     * @param litros   Tipo double.
     * @return Tipo double.
     */
    private static double litrosAGalones(double litros) {
        convertirunidadesvolumen.ConvertirUnidadesVolumen_Service service = new convertirunidadesvolumen.ConvertirUnidadesVolumen_Service();
        convertirunidadesvolumen.ConvertirUnidadesVolumen port = service.getConvertirUnidadesVolumenPort();
        return port.litrosAGalones(litros);
    }
    
}
