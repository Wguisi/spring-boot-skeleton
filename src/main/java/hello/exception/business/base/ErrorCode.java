package hello.exception.business.base;

public enum ErrorCode {

    NOT_FOUND("1010", "Ocorreu erro na base de dados.", "Ocorreu erro na base de dados."),
    GENERIC("1500", "Ocorreu um erro interno", "Tente fazer a operação novamente em instantes");


    /**
     * Código do erro
     */
    private String code;

    /**
     * Descrição do erro (técnico).
     */
    private String description;

    /**
     * Comentários
     */
    private String comments;

    private ErrorCode(String code, String description, String comments) {
        this.code = code;
        this.description = description;
        this.comments = comments;
    }

    public String getDescription() {
        return description;
    }

    public String getCode() {
        return code;
    }

    public String getComments() {
        return comments;
    }

}
