package br.ufc.comp.qalc.frontend.token;

public class ResidToken extends Token {
    protected String ResultID;


    public ResidToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }

    @Override
    public void interpretAttributes() {
        if(getStringValue() !=null){
            ResultID= getStringValue();
            stringValue=null;
        }
    }

    @Override
    public String getTokenIdentifier() {
        return "RESID";
    }
}
