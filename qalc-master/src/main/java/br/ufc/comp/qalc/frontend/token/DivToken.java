package br.ufc.comp.qalc.frontend.token;

public class DivToken extends Token{
    protected char Simbol='/';

    public DivToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }

    @Override
    public void interpretAttributes() {
    }

    @Override
    public String getTokenIdentifier() {
        return "DIV";
    }
}
