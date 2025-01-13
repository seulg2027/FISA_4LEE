import './index.css';
import { MantineProvider } from '@mantine/core';
import { Global } from '@mantine/core';  // 필요한 경우, Global 스타일도 추가할 수 있음
import App from './App';
import React from 'react';
import ReactDOM from 'react-dom/client';
import reportWebVitals from './reportWebVitals';

import '@mantine/core/styles.css';  

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <MantineProvider withGlobalStyles
      withNormalizeCSS
      theme={{
        colorScheme: 'light', 
      }}>
      <App />
    </MantineProvider>
  </React.StrictMode>
);

reportWebVitals();
