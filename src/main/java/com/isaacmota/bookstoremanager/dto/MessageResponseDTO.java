package com.isaacmota.bookstoremanager.dto;


public class MessageResponseDTO {

	private String message;
	
	// Construtor padrão
    public MessageResponseDTO() {
    }

    // Construtor com parâmetros
    public MessageResponseDTO(String message) {
        this.message = message;
    }
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	// Builder pattern
    public static class Builder {
        private String message;

        public Builder() {
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public MessageResponseDTO build() {
            return new MessageResponseDTO(message);
        }
    }

    // Método estático para obter o builder
    public static Builder builder() {
        return new Builder();
    }
}
	

