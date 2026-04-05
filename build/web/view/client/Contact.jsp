<%-- 
    Document   : Contact
    Created on : 5 thg 4, 2026, 12:27:55
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="form-box" id="contactBox">
        <div class="close-arrow" onclick="closeContact()">←</div>
        <h2>Liên hệ</h2>
        <input id="cname" placeholder="Tên">
        <input id="cemail" placeholder="Email">
        <textarea style="resize: none" id="cmsg" rows="5" placeholder="Nội dung"></textarea>
        <button type="submit">Gửi</button>
        </div>