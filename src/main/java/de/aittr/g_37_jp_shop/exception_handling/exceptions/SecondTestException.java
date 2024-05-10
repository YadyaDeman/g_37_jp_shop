package de.aittr.g_37_jp_shop.exception_handling.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
// 2 СПОСОБ обработки исключений
// ПЛЮС - быстро и удобно без лишнего кода создаём
// глобальный обработчик исключения
// МИНУС - клиент не видит детализированного сообщения об ошибке,
// следовательно, затрудняется анализ причин её возникновения
public class SecondTestException extends RuntimeException {

    public SecondTestException(String message) {
        super(message);
    }
}
