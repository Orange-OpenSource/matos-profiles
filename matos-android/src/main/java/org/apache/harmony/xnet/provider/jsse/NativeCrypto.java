package org.apache.harmony.xnet.provider.jsse;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2010 - 2014 Orange SA
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


public final class NativeCrypto
{
  // Classes

  public static interface SSLHandshakeCallbacks
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("SSLHandshakeCallbacks")
    public void handshakeCompleted();
    @com.francetelecom.rd.stubs.annotation.CallBack("SSLHandshakeCallbacks")
    public void clientCertificateRequested(byte [] arg1, byte [] [] arg2) throws java.security.cert.CertificateEncodingException, javax.net.ssl.SSLException;
    @com.francetelecom.rd.stubs.annotation.CallBack("SSLHandshakeCallbacks")
    public void verifyCertificateChain(byte [] [] arg1, java.lang.String arg2) throws java.security.cert.CertificateException;
  }
  // Fields

  public static final int RAND_SEED_LENGTH_IN_BYTES = 1024;

  public static final java.util.Map<java.lang.String, java.lang.String> OPENSSL_TO_STANDARD_CIPHER_SUITES = null;

  public static final java.util.Map<java.lang.String, java.lang.String> STANDARD_TO_OPENSSL_CIPHER_SUITES = null;

  public static final java.lang.String TLS_EMPTY_RENEGOTIATION_INFO_SCSV = "TLS_EMPTY_RENEGOTIATION_INFO_SCSV";

  public static final long SSL_MODE_HANDSHAKE_CUTTHROUGH = 64l;

  public static final long SSL_OP_NO_TICKET = 16384l;

  public static final long SSL_OP_NO_COMPRESSION = 131072l;

  public static final long SSL_OP_NO_SSLv3 = 33554432l;

  public static final long SSL_OP_NO_TLSv1 = 67108864l;

  public static final int SSL_VERIFY_NONE = 0;

  public static final int SSL_VERIFY_PEER = 1;

  public static final int SSL_VERIFY_FAIL_IF_NO_PEER_CERT = 2;

  // Constructors

  public NativeCrypto(){
  }
  // Methods

  public static java.lang.String [] getSupportedCipherSuites(){
    return (java.lang.String []) null;
  }
  public static java.lang.String [] getSupportedProtocols(){
    return (java.lang.String []) null;
  }
  public static void setEnabledCipherSuites(int arg1, java.lang.String [] arg2){
  }
  public static void setEnabledProtocols(int arg1, java.lang.String [] arg2){
  }
  public static java.lang.String [] getSupportedCompressionMethods(){
    return (java.lang.String []) null;
  }
  public static void setEnabledCompressionMethods(int arg1, java.lang.String [] arg2){
  }
  public static int X509_NAME_hash_old(javax.security.auth.x500.X500Principal arg1){
    return 0;
  }
  public static int EVP_get_digestbyname(java.lang.String arg1){
    return 0;
  }
  public static int EVP_MD_size(int arg1){
    return 0;
  }
  public static void EVP_DigestUpdate(int arg1, byte [] arg2, int arg3, int arg4){
  }
  public static int EVP_DigestFinal(int arg1, byte [] arg2, int arg3){
    return 0;
  }
  public static int EVP_MD_CTX_copy(int arg1){
    return 0;
  }
  public static int EVP_DigestInit(int arg1){
    return 0;
  }
  public static void EVP_MD_CTX_destroy(int arg1){
  }
  public static void EVP_VerifyUpdate(int arg1, byte [] arg2, int arg3, int arg4){
  }
  public static int EVP_PKEY_new_DSA(byte [] arg1, byte [] arg2, byte [] arg3, byte [] arg4, byte [] arg5){
    return 0;
  }
  public static int EVP_PKEY_new_RSA(byte [] arg1, byte [] arg2, byte [] arg3, byte [] arg4, byte [] arg5){
    return 0;
  }
  public static int EVP_VerifyInit(java.lang.String arg1){
    return 0;
  }
  public static int EVP_VerifyFinal(int arg1, byte [] arg2, int arg3, int arg4, int arg5){
    return 0;
  }
  public static void EVP_PKEY_free(int arg1){
  }
  public static java.lang.String [] getDefaultCipherSuites(){
    return (java.lang.String []) null;
  }
  public static final java.lang.String [] getDefaultCompressionMethods(){
    return (java.lang.String []) null;
  }
  public static int RAND_load_file(java.lang.String arg1, long arg2){
    return 0;
  }
  public static void RAND_seed(byte [] arg1){
  }
  public static int SSL_new(int arg1) throws javax.net.ssl.SSLException{
    return 0;
  }
  public static long SSL_clear_options(int arg1, long arg2){
    return 0l;
  }
  public static void SSL_set_tlsext_host_name(int arg1, java.lang.String arg2) throws javax.net.ssl.SSLException{
  }
  public static void SSL_set_session_creation_enabled(int arg1, boolean arg2) throws javax.net.ssl.SSLException{
  }
  public static void SSL_set_session(int arg1, int arg2) throws javax.net.ssl.SSLException{
  }
  public static void SSL_set_verify(int arg1, int arg2){
  }
  public static byte [] [] encodeIssuerX509Principals(java.security.cert.X509Certificate [] arg1) throws java.security.cert.CertificateEncodingException{
    return (byte [] []) null;
  }
  public static void SSL_set_client_CA_list(int arg1, byte [] [] arg2){
  }
  public static long SSL_clear_mode(int arg1, long arg2){
    return 0l;
  }
  public static int SSL_do_handshake(int arg1, java.io.FileDescriptor arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("SSLHandshakeCallbacks") NativeCrypto.SSLHandshakeCallbacks arg3, int arg4, boolean arg5) throws javax.net.ssl.SSLException, java.net.SocketTimeoutException, java.security.cert.CertificateException{
    return 0;
  }
  public static byte [] SSL_SESSION_session_id(int arg1){
    return (byte []) null;
  }
  public static void SSL_SESSION_free(int arg1){
  }
  public static byte [] [] SSL_get_certificate(int arg1){
    return (byte [] []) null;
  }
  public static byte [] [] SSL_get_peer_cert_chain(int arg1){
    return (byte [] []) null;
  }
  public static byte [] [] encodeCertificates(java.security.cert.Certificate [] arg1) throws java.security.cert.CertificateEncodingException{
    return (byte [] []) null;
  }
  public static void SSL_use_PrivateKey(int arg1, byte [] arg2){
  }
  public static void SSL_use_certificate(int arg1, byte [] [] arg2){
  }
  public static void SSL_check_private_key(int arg1) throws javax.net.ssl.SSLException{
  }
  public static java.lang.String [] checkEnabledCipherSuites(java.lang.String [] arg1){
    return (java.lang.String []) null;
  }
  public static java.lang.String [] checkEnabledProtocols(java.lang.String [] arg1){
    return (java.lang.String []) null;
  }
  public static java.lang.String [] checkEnabledCompressionMethods(java.lang.String [] arg1){
    return (java.lang.String []) null;
  }
  public static void SSL_interrupt(int arg1) throws java.io.IOException{
  }
  public static void SSL_shutdown(int arg1, java.io.FileDescriptor arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("SSLHandshakeCallbacks") NativeCrypto.SSLHandshakeCallbacks arg3) throws java.io.IOException{
  }
  public static void SSL_free(int arg1){
  }
  public static int SSL_CTX_new(){
    return 0;
  }
  public static void SSL_CTX_free(int arg1){
  }
  public static int EVP_MD_block_size(int arg1){
    return 0;
  }
  public static int X509_NAME_hash(javax.security.auth.x500.X500Principal arg1){
    return 0;
  }
  public static long SSL_get_mode(int arg1){
    return 0l;
  }
  public static long SSL_set_mode(int arg1, long arg2){
    return 0l;
  }
  public static long SSL_get_options(int arg1){
    return 0l;
  }
  public static long SSL_set_options(int arg1, long arg2){
    return 0l;
  }
  public static void SSL_set_cipher_lists(int arg1, java.lang.String [] arg2){
  }
  public static java.lang.String SSL_get_servername(int arg1){
    return (java.lang.String) null;
  }
  public static void SSL_renegotiate(int arg1) throws javax.net.ssl.SSLException{
  }
  public static int SSL_read(int arg1, java.io.FileDescriptor arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("SSLHandshakeCallbacks") NativeCrypto.SSLHandshakeCallbacks arg3, byte [] arg4, int arg5, int arg6, int arg7) throws java.io.IOException{
    return 0;
  }
  public static void SSL_write(int arg1, java.io.FileDescriptor arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("SSLHandshakeCallbacks") NativeCrypto.SSLHandshakeCallbacks arg3, byte [] arg4, int arg5, int arg6) throws java.io.IOException{
  }
  public static long SSL_SESSION_get_time(int arg1){
    return 0l;
  }
  public static java.lang.String SSL_SESSION_get_version(int arg1){
    return (java.lang.String) null;
  }
  public static java.lang.String SSL_SESSION_cipher(int arg1){
    return (java.lang.String) null;
  }
  public static java.lang.String SSL_SESSION_compress_meth(int arg1, int arg2){
    return (java.lang.String) null;
  }
  public static byte [] i2d_SSL_SESSION(int arg1){
    return (byte []) null;
  }
  public static int d2i_SSL_SESSION(byte [] arg1){
    return 0;
  }
}
