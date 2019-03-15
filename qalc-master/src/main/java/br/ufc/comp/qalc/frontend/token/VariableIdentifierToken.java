package br.ufc.comp.qalc.frontend.token;

/**
 * Classe que representa um token do tipo (VARID).
 */
public class VariableIdentifierToken extends Token {


    public VariableIdentifierToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }

    /**
     * Para este tipo de token, descarta o {@code $} do lexema, caso não tenha sido descartado ainda.
     *
     * @see Token#interpretAttributes()
     */
    @Override
    public void interpretAttributes() {
        if(getStringValue() !=null  && getStringValue().charAt(0) == '$'){
            stringValue= getStringValue().substring(1);
        }
    }

    @Override
    public String getTokenIdentifier() {
        return "VARID";
    }

}
