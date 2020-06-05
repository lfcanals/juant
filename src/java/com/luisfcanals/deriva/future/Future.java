/*
 * Copyright Luis F. Canals luisf.canals@gmail.com , 2020
 * Reservados todos los derechos.
 * Este documento es material confidencial propiedad de 
 * Luis F. Canals luisf.canals@gmail.com 
 * Se prohibe la divulgación o revelación de su contenido
 * sin el permiso previo y por escrito del propietario.
 *
 * Copyright Luis F. Canals luisf.canals@gmail.com , 2020
 * All rights reserved.
 * This document consists of confidential information property of 
 * Luis F. Canals luisf.canals@gmail.com
 * Its content may not be used or disclosed without
 * prior written permission of the owner.
 */
package com.luisfcanals.deriva.future;

import java.util.*;
import com.luisfcanals.deriva.Product;
import com.luisfcanals.deriva.market.Market;


public class Future implements Product {
    @Override
    public void setMarket(final Market m) {
        throw new UnsupportedOperationException("IMPLEMENT ME!");
    }

    @Override
    public double getAcquisitionPrice() {
        throw new UnsupportedOperationException("IMPLEMENT ME!");
    }

    @Override
    public double getReleasePrice(final Calendar cal) {
        throw new UnsupportedOperationException("IMPLEMENT ME!");
    }

    @Override
    public double getProfit(final Calendar when) {
        throw new UnsupportedOperationException("IMPLEMENT ME!");
    }
}
