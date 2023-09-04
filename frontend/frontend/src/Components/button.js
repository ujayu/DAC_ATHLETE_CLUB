// import "../CSS/App1.css";
// import GooglePayButton from "@google-pay/button-react";
// import React from "react";
 
// function Button() {
//     const pr="99";
//   return (
//     <div className="App">
//       <GooglePayButton
//         environment="TEST"
//         paymentRequest={{
//           apiVersion: 2,
//           apiVersionMinor: 0,
//           allowedPaymentMethods: [
//             {
//               type: "CARD",
//               parameters: {
//                 allowedAuthMethods: ["PAN_ONLY", "CRYPTOGRAM_3DS"],
//                 allowedCardNetworks: ["MASTERCARD", "VISA"],
//               },
//               tokenizationSpecification: {
//                 type: "PAYMENT_GATEWAY",
//                 parameters: {
//                   gateway: "example",
//                   gatewayMerchantId: "exampleGatewayMerchantId",
//                 },
//               },
//             },
//           ],
//           merchantInfo: {
//             merchantId: "",
//             merchantName: "Tejas Patil Dhulekar",
//           },
//           transactionInfo: {
//             totalPriceStatus: "FINAL",
//             totalPriceLabel: "Total",
//             totalPrice: pr,
//             currencyCode: "INR",
//             countryCode: "IN",
//           },
//           shippingAddressRequired: true,
//           callbackIntents: ["PAYMENT_AUTHORIZATION"],
//         }}
//         onLoadPaymentData={(paymentRequest) => {
//           console.log(paymentRequest);
//         }}
//         onPaymentAuthorized={paymentData =>{
//           console.log('paymentData ' + paymentData);
          
//           return { transactionState: 'SUCCESS'}
//         }}
//         existingPaymentMethodRequired='false'
//         buttonColor="black"
//         buttonType="buy"
//       >
//         Clssss
//       </GooglePayButton>
//     </div>
//   );
// }

// export default Button;