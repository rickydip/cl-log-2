/*
 * The MIT License
 *
 * Copyright 2012 Università di Messina.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.clever.HostManager.SOS.SOSModuleCore;

import java.util.Vector;

/**
 *
 * @author user
 */
public class GetObservationBufferData {
    /*    private String maxTime;
    private String minTime;*/

    private Vector<String> procedure;
    private Vector<GetObservationValueBufferData> values;

    GetObservationBufferData() {
        /* this.maxTime="";
        this.minTime="";*/
        this.procedure = new Vector<String>(1);
        this.values = new Vector<GetObservationValueBufferData>(1);




    }
    
    Vector<String> getprocedure() {
        return this.procedure;

    }

    Vector<GetObservationValueBufferData> getvalues() {
        return this.values;

    }

    void setprocedure(Vector<String> elem) {
        this.procedure = elem;
    }

    void setvalues(Vector<GetObservationValueBufferData> elem) {
        this.values = elem;
    }
}
