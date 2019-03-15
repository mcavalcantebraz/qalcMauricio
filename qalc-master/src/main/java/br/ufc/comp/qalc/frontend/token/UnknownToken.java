package br.ufc.comp.qalc.frontend.token;

public class UnknownToken extends Token {

    public UnknownToken(long line, long start, String value) throws IllegalArgumentException {
        super(line,start,value);
    }

    public void interpretAttributes(){
        if(getStringValue() != null){
            stringValue = getStringValue();
        }
    }
    public String getTokenIdentifier(){
        return "";
    }


}
