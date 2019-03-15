package br.ufc.comp.qalc.frontend.token;

public class FunctionToken extends Token {

    protected String NomeFuncao;


    public FunctionToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }

    @Override
    public void interpretAttributes() {
        if(getStringValue() !=null){
            NomeFuncao= getStringValue();
            stringValue=null;
        }
    }

    @Override
    public String getTokenIdentifier() {
        return "FUNCID";
    }
}
