use PHPMailer\PHPMailer\PHPMailer;
use PHPMailer\PHPMailer\Exception;
use PHPMailer\PHPMailer\PHPMailer;
use PHPMailer\PHPMailer\Exception;

<?php
require 'config.php';


require 'path/to/PHPMailer/src/Exception.php';
require 'path/to/PHPMailer/src/PHPMailer.php';
require 'path/to/PHPMailer/src/SMTP.php';

$mail = new PHPMailer(true);

try {
    //Server settings
    $mail->SMTPDebug = 2;                                 
    $mail->isSMTP();                                      
    $mail->Host = $config['smtp_host'];  
    $mail->SMTPAuth = true;                               
    $mail->Username = $config['Jack'];                 
    $mail->Password = $config['pzyritghpcvazwvr'];                           
    $mail->SMTPSecure = 'tls';                            
    $mail->Port = $config['smtp_port'];                                   

    //Recipients
    $mail->setFrom('jackhope200@gmail.com', 'Mailer');
    $mail->addAddress('prathamwagare2020@gmail.com', 'Joe User');     

    //Content
    $mail->isHTML(true);                                  
    $mail->Subject = 'Here is the subject';
    $mail->Body    = 'This is the HTML message body <b>in bold!</b>';
    $mail->AltBody = 'This is the body in plain text for non-HTML mail clients';

    $mail->send();
    echo 'Message has been sent';
} catch (Exception $e) {
    echo 'Message could not be sent. Mailer Error: ', $mail->ErrorInfo;
}
?>