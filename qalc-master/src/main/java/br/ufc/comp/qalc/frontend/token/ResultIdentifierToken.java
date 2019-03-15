package br.ufc.comp.qalc.frontend.token;

/**
 * Classe que representa um token do tipo (RESID).
 */
public class ResultIdentifierToken extends Token {
    /**
     * Número correspondente ao que o lexema deste token representa.
     * <p>
     * Só é inicializado quando solicitado.
     *
     * @see #interpretAttributes()
     */
    protected long resultNumber;

    public ResultIdentifierToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }

    /**
     * Para este tipo de token, descarta o {@code $} e converte o lexema em um número do tipo
     * {@code double}, caso não tenha feito ainda.
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
        return "RESID";
    }

}
