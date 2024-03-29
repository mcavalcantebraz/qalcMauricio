package br.ufc.comp.qalc.frontend.token;

/**
 * Classe que representa um token do tipo (NUM).
 */
public class NumberToken extends Token {
    /**
     * Valor que o lexema deste token representa.
     * <p>
     * Só é inicializado quando solicitado.
     *
     * @see #interpretAttributes()
     */
    protected double numericValue;

    public NumberToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }

    /**
     * Para este tipo de token, converte o lexema em um número do tipo {@code double},
     * caso não tenha feito ainda.
     *
     * @see Token#interpretAttributes()
     */
    @Override
    public void interpretAttributes() {
        if (getStringValue() != null) {
            numericValue = Double.parseDouble(getStringValue());
            stringValue = null;
        }
    }

    @Override
    public String getTokenIdentifier() {
        return "NUML";
    }
}
